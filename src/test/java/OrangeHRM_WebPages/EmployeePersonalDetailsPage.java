package OrangeHRM_WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class EmployeePersonalDetailsPage extends SeleniumUtility{
	
	public EmployeePersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//form[@class='oxd-form']/div[2]/div[2]/div[1]/div/div[2]/input")
	private WebElement LicenseNumInputField;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[5]/button")
	private WebElement SaveButton;

	public WebElement getLicenseNumInputField() {
		return LicenseNumInputField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public void EditDetails(String LicenseNumber) {
		setSleepTime(2000);
		clickOnElement(LicenseNumInputField);
		typeInput(LicenseNumInputField, LicenseNumber);
		
	}
	public void saveButton() {
		clickOnElement(SaveButton);
	}
}
