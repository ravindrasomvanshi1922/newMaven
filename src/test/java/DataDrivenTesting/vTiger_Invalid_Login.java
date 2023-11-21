package DataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class vTiger_Invalid_Login extends SeleniumUtility{
	
	String appUrl;
	String userName;
	String password;
	static int row = 2;
	static String expectedTitle;
	static String actualTitle;
	
	@BeforeTest
	public void getData() {
		
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "Tc", row, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 2);
		expectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest.xlsx", "TC", row, 3);
	}
	
	@Test
	public void Invalid_Login() {
		
		setUp("Chrome", appUrl);
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.id("password")), password);
		clickOnElement(driver.findElement(By.tagName("button")));
		actualTitle = getCurrentPageTitle("vtiger");
		Assert.assertEquals(actualTitle, "Dashboard");
	}
	
	@AfterTest
	public void CleanUp() {
		
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
