package vTiger_WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//button[@class=\"button buttonBlue\"]")
	private WebElement signInBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
//********************************************************************
	
	public void UserName(String UserName) {
		typeInput(userName, UserName);
	}
	
	public void Password(String Password) {
		typeInput(password, Password);
	}
	
	public void SignInBtn() {
		clickOnElement(signInBtn);
	}

}
