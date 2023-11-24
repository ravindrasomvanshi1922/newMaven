package OrangeHRM_Webages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class EmpPersonalDetail_Page extends SeleniumUtility{
	public EmpPersonalDetail_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"middleName\"]")
	private WebElement middleNameField;
	
	
	@FindBy(xpath="//form[@class=\"oxd-form\"]/div[2]/div[2]/div[1]/div/div[2]/input")
	private WebElement liscenceNumField;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[5]/button")
	private WebElement saveBtn;
	
//_____________________________________________________________________________________
	
	public WebElement getMiddleNameField() {
		return middleNameField;
	}
	
	public WebElement getLiscenceNumField() {
		return liscenceNumField;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
//_______________________________________________________________________________________
	
	public void UpdateMiddleName(String MiddleName) {
		clickOnElement(middleNameField);
		typeInput(middleNameField, MiddleName);
		clickOnElement(saveBtn);
	}

	public void UpdateEmpInfo(String LiscenceNum) {
		clickOnElement(liscenceNumField);
		typeInput(liscenceNumField, LiscenceNum);
		clickOnElement(saveBtn);
	}

}
