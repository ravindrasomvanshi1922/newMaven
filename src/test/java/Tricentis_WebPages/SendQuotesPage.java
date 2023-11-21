package Tricentis_WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SendQuotesPage extends SeleniumUtility{
	public SendQuotesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement EmailField;
	
	@FindBy(id="phone")
	private WebElement PhoneField;
	
	@FindBy(id="username")
	private WebElement UsernameField;
	
	@FindBy(id="password")
	private WebElement PasswordField;
	
	@FindBy(id="confirmpassword")
	private WebElement ConfirmPasswordField;
	
	@FindBy(id="sendemail")
	private WebElement SendeMailButton;

	public WebElement getEmailField() {
		return EmailField;
	}

	public WebElement getPhoneField() {
		return PhoneField;
	}

	public WebElement getUsernameField() {
		return UsernameField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getConfirmPasswordField() {
		return ConfirmPasswordField;
	}

	public WebElement getSendeMailField() {
		return SendeMailButton;
	}
	
//________________________________________________________________
//________________________________________________________________
	
	public void EmailField(String Email) {
		typeInput(EmailField, Email);
	}
	
	public void PhoneField(String Phone) {
		typeInput(PhoneField, Phone);
	}
	
	public void UsernameField(String Username) {
		typeInput(UsernameField, Username);
	}
	
	public void PasswordField(String Password) {
		typeInput(PasswordField, Password);
	}
	
	public void ConfirmPasswordField(String ConfirmPassword) {
		typeInput(ConfirmPasswordField, ConfirmPassword);
	}
	
	public void SendeMailButton() {
		clickOnElement(SendeMailButton);
	}

}
