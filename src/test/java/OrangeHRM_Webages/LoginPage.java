package OrangeHRM_Webages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement userNameField;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement passwordField;
	
	@FindBy(css=".orangehrm-login-button")
	private WebElement LoginBtn;

// ________________________________________________________________________
	
	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
//_______________________________________________________________________
	
	public void LogIntoApplication(String Username, String Password) {
		typeInput(userNameField, Username);
		typeInput(passwordField, Password);
		clickOnElement(LoginBtn);
	}
	

}
