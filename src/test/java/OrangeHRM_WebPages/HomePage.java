package OrangeHRM_WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility{
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".oxd-userdropdown-name")
	private WebElement profileLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	//PIM link
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIMLink;
	
	

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getPIMLink() {
		return PIMLink;
	}
//--------------------------------------------------------	
	public void logoutFromApplication() {
		clickOnElement(profileLink);
		clickOnElement(logoutLink);
	}
	public void PIMLink() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header[@class='oxd-topbar']/div/div[2]/ul/li/span/p")));
		clickOnElement(PIMLink);
		
	}
}
