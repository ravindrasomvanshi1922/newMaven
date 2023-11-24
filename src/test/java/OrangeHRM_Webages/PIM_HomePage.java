package OrangeHRM_Webages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PIM_HomePage extends SeleniumUtility{
	public PIM_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"oxd-topbar-body\"]/nav/ul/li[3]/a")
	private WebElement addEmpBtn;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement empId;
	
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]/button[2]")
	private WebElement searchBtn;
	
	@FindBy(css=".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;
	
	@FindBy(xpath="//div[@class=\"oxd-table-body\"]/div/div/div[3]/div")
	private WebElement updatedMiddleName;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBox;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-pencil-fill")
	private WebElement firstEmpEditSymbol;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;
	
	@FindBy(css=".orangehrm-modal-footer>button:nth-of-type(2)")
	private WebElement yesButtonOnConfirmationPopup;
	
	
	
//__________________________________________________________________________________

	public WebElement getAddEmpBtn() {
		return addEmpBtn;
	}

	public WebElement getUpdatedMiddleName() {
		return updatedMiddleName;
	}

	public WebElement getEmpId() {
		return empId;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSearchResultCountMsg() {
		return searchResultCountMsg;
	}

	public WebElement getFirstEmpCheckBox() {
		return firstEmpCheckBox;
	}

	public WebElement getFirstEmpEditSymbol() {
		return firstEmpEditSymbol;
	}

	public WebElement getFirstEmpDeleteSymbol() {
		return firstEmpDeleteSymbol;
	}

	public WebElement getYesButtonOnConfirmationPopup() {
		return yesButtonOnConfirmationPopup;
	}
	
	
//_____________________________________________________________________
	
	public void AddEmpBtn() {
		clickOnElement(addEmpBtn);
	}
	
	public void SearchEmpId(String EmpId) {
		clickOnElement(empId);
		typeInput(empId, EmpId);
	}
	
	public void SearchButton() {
		clickOnElement(searchBtn);
	}
	
	public String getSearchResultMsg() {
		setSleepTime(2000);
		return getTextForElement(searchResultCountMsg);
	}
	
	public void checkBox() {
		clickOnElement(firstEmpCheckBox);
	}
	
	public void EditClick() {
		clickOnElement(firstEmpEditSymbol);
	}
	
	public void EditCreateEmp() {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpEditSymbol);
	}
	
	public void DeleteCreateEmp() {
		clickOnElement(firstEmpDeleteSymbol);
		clickOnElement(yesButtonOnConfirmationPopup);
	}
	
	public String UpdatedMiddleNameText() {
		return getTextForElement(updatedMiddleName);
	}
	

}
