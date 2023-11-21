package DataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class OrangeHRM_ValidCredentials extends SeleniumUtility{
	
	String appUrl;
	String userName;
	String password;
	static int row=1;
	static String expectedUrl;
	static String actualUrl;
	
	@BeforeTest
	public void GetData() {
		
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest_URL.xlsx", "Sheet1", row, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest_URL.xlsx", "Sheet1", row, 1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest_URL.xlsx", "Sheet1", row, 2);
		expectedUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTestExcel\\AppTest_URL.xlsx", "Sheet1", row, 3);
	}
	
	@Test
	public void Login() {
		
		setUp("Chrome", appUrl);
		typeInput(driver.findElement(By.name("username")), userName);
		typeInput(driver.findElement(By.name("password")), password);
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
		actualUrl = getApplicationUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@AfterTest
	public void CleanUp() {
		
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTestExcel\\AppTest_URL.xlsx", "Sheet1", row, 4, actualUrl);
		if(actualUrl.equals(expectedUrl)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTestExcel\\AppTest_URL.xlsx", "Sheet1", row, 5, "Passed");
		}else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTestExcel\\AppTest_URL.xlsx", "Sheet1", row, 5, "Failed");
		}
		driver.close();
		++row;
	}
}
