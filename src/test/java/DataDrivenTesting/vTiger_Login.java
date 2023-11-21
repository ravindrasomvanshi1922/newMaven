package DataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class vTiger_Login extends SeleniumUtility{
	
	String appUrl;
	String userName;
	String password;
	static int row=1;
	static String expectecTitle;
	static String actualTitle;
	
	@BeforeMethod
	public void Credentials() {
		
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 2);
		expectecTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 3);
	}
	
	@Test
	public void Login() {
		
		setUp("Chrome", appUrl);
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.id("password")), password);
		clickOnElement(driver.findElement(By.tagName("button")));
		actualTitle = getCurrentPageTitle("Dashboard");
		Assert.assertEquals(actualTitle, "Dashboard");
		System.out.println("End");
	}
	
	@AfterMethod
	public void Cleanup() {
		
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 4, actualTitle);
		if(actualTitle.equals("Dashboard")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 5, "Passed");
		}else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 5, "Failed");
		}
		driver.close();
		++row;
	}

}
