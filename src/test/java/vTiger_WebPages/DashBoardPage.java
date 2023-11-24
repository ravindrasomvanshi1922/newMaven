package vTiger_WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class DashBoardPage extends SeleniumUtility {
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id=\"appnavigator\"]/div/span")
	private WebElement appNavigator;
	
	@FindBy(xpath="//div[@class=\"app-list row\"]/div")
	private List<WebElement> appList;
	
	@FindBy(xpath="//div[@class=\"app-list row\"]/div[2]")
	private WebElement marketingLink;
	
	@FindBy(xpath="//div[@id=\"mCSB_1\"]/div/li")
	private List<WebElement> marketingDrp;
	
	@FindBy(xpath="//div[@id=\"mCSB_1\"]/div/li[3]/a/span/i")
	private WebElement contact;
	
	@FindBy(xpath="//li[@class=\"dropdown\"]/div/a/span")
	private WebElement profileLink;
	
	@FindBy(xpath="//a[@id=\"menubar_item_right_LBL_SIGN_OUT\"]")
	private WebElement signOutBtn;

	public WebElement getAppNavigator() {
		return appNavigator;
	}

	public List<WebElement> getAppList() {
		return appList;
	}

	public WebElement getMarketingLink() {
		return marketingLink;
	}

	public List<WebElement> getMarketingDrp() {
		return marketingDrp;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
	
//*********************************************************************
	
	public void AppNavigator() {
		clickOnElement(appNavigator);
	}
	
	public void Marketing() {
		clickOnElement(marketingLink);
	}
	
	public void Contact() {
		clickOnElement(contact);
	}
	
	public void ProfilLink() {
		clickOnElement(profileLink);
	}
	
	public void SignOutBtn() {
		clickOnElement(signOutBtn);
	}
	
	
}
