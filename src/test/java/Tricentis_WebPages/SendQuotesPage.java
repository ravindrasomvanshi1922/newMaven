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
	
	@FindBy(xpath="//input[@id=\"email\"]")
	private WebElement eMail;
	
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@id=\"confirmpassword\"]")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//div[@class=\"sa-button-container\"]/div/button")
	private WebElement okBtn;
	
	@FindBy(xpath="//button[@id=\"sendemail\"]")
	private WebElement sendeMailBtn;
	
	public WebElement getSendeMailBtn() {
		return sendeMailBtn;
	}

	public WebElement getEmailMsg() {
		return emailMsg;
	}

	public void setEmailMsg(WebElement emailMsg) {
		this.emailMsg = emailMsg;
	}

	@FindBy(xpath="//div[@class=\"sweet-alert showSweetAlert visible\"]/h2")
	private WebElement emailMsg;
	

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	
// **************************************************************
	
	public void EMail(String EMail) {
		clickOnElement(eMail);
		typeInput(eMail, EMail);
	}
	
	public void UserName(String UserName) {
		clickOnElement(username);
		typeInput(username, UserName);
	}
	
	public void Password(String Password) {
		clickOnElement(password);
		typeInput(password, Password);
	}
	
	public void ConfirmPassword(String ConfirmPassword) {
		clickOnElement(confirmpassword);
		typeInput(confirmpassword, ConfirmPassword);
	}
	
	public void SendBtn() {
		clickOnElement(sendeMailBtn);
	}
	
	public String MailMsg() {
		return getTextForElement(emailMsg);
	}
	
	public void OkBtn() {
		clickOnElement(okBtn);
	}
	
}
