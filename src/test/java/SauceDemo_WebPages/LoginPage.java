package SauceDemo_WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility{
	
	public LoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement UserNameField;
	
	@FindBy(id="password")
	private WebElement PasswordField;
	
	@FindBy(id="login-button")
	private WebElement LoginButton;
//--------------------------------------------------------
	public WebElement getUserNameField() {
		return UserNameField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
// ------------------------------------------------------------
	
	public void LoginCredentials(String UserName, String PassWord) {
		typeInput(UserNameField, UserName);
		typeInput(PasswordField, PassWord);
		clickOnElement(LoginButton);
	}

}
