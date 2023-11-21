package OrangeHRM_WebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class AddEmployeePage extends SeleniumUtility{
	
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstName")
	private WebElement FirstNameInput;
	
	@FindBy(name="lastName")
	private WebElement LastNameInput;
	
	@FindBy(xpath="//div[@class='oxd-form-row']/div[2]/div/div/div[2]/input")
	private WebElement EmployeeIdInputField;
	
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]/button[2]")
	private WebElement SaveButton;
	
	public WebElement getFirstNameInput() {
		return FirstNameInput;
	}

	public WebElement getLastNameInput() {
		return LastNameInput;
	}

	public WebElement getEmployeeIdInputField() {
		return EmployeeIdInputField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	

	public void AddEmployeePage(String FirstName,String LastName) {
		typeInput(FirstNameInput, FirstName);
		typeInput(LastNameInput, LastName);
	}
	
	public void AddEmpID(String EmployeeId) {
		getLastNameInput().sendKeys(Keys.TAB);
		getEmployeeIdInputField().sendKeys(Keys.BACK_SPACE);
		typeInput(EmployeeIdInputField, EmployeeId);
		
	}
	public void SaveButton() {
		clickOnElement(SaveButton);
	}

}
