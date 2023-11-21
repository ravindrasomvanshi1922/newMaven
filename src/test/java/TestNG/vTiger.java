package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class vTiger {

	SeleniumUtility util = new SeleniumUtility();
	WebDriver driver = util.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

	@Test(priority=1)
	public void UserName() {

		WebElement UsernameInputfield = driver.findElement(By.name("username"));
		Assert.assertTrue(UsernameInputfield.isDisplayed());
		Assert.assertTrue(UsernameInputfield.isEnabled());
		String ExpectedDefaultValue = "Username";
		String ActualDefaultValue = UsernameInputfield.getAttribute("placeholder");
		Assert.assertEquals(ActualDefaultValue, ExpectedDefaultValue);
		util.typeInput(UsernameInputfield, "admin");
	}

	@Test(priority=2)
	public void Password() {

		WebElement PasswordInputField = driver.findElement(By.name("password"));
		Assert.assertTrue(PasswordInputField.isDisplayed());
		Assert.assertTrue(PasswordInputField.isEnabled());
		String ExpectedDefaultValue1 = "Password";
		String ActualDefaultValue1 = PasswordInputField.getAttribute("placeholder");
		Assert.assertEquals(ActualDefaultValue1, ExpectedDefaultValue1);
		util.typeInput(PasswordInputField, "admin");
	}

	@Test(priority=3)
	public void LoginButton() {

		WebElement LoginButton = driver.findElement(By.className("button"));
		Assert.assertTrue(LoginButton.isDisplayed());
		Assert.assertTrue(LoginButton.isEnabled());
		String ExpectedDefaultValue2 = "Sign in";
		String ActualDefaultValue2 = LoginButton.getText();
		Assert.assertEquals(ActualDefaultValue2, ExpectedDefaultValue2);
		
	}
	
	@Test(priority=4)
	public void HomePage () {
		
		WebElement LoginButton = driver.findElement(By.className("button"));
		util.clickOnElement(LoginButton);
		String ExpectedHomePageTitle = "Dashboard";
		String ActualHomePageTitle = driver.getTitle();
		Assert.assertEquals(ActualHomePageTitle, ExpectedHomePageTitle);
	}

}
