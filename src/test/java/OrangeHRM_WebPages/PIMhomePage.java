package OrangeHRM_WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PIMhomePage extends SeleniumUtility{
	
	public PIMhomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(css="nav > ul > li:nth-child(3) > a")
	private WebElement AddEmployeeButton;
	
	@FindBy(xpath="//div[@class=\"oxd-form-row\"]/div/div[1]/div/div[2]/div/div/input")
	private WebElement NameSearch;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement EmployeeIDSearch;
	
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]/button[2]")
	private WebElement SearchButton;
	
	@FindBy(xpath="//div[@class='orangehrm-container']/div/div[2]/div/div/div[2]/div")
	private WebElement SelectId;
	
	@FindBy(xpath="//div[@class='orangehrm-container']/div/div[2]/div/div/div[9]/div[1]/button[1]/i")
	private WebElement DeleteButton;
	
	@FindBy(xpath="//div[@id='app']/div[3]/div/div/div/div[3]/button[2]/i")
	private WebElement DeleteConfirmButton;
	
	@FindBy(css="ul >*:nth-child(8) > a > span")
	private WebElement DashboardLink;
	
	
	
	public WebElement getAddEmployeeButton() {
		return AddEmployeeButton;
	}



	public WebElement getNameSearch() {
		return NameSearch;
	}



	public WebElement getEmployeeIDSearch() {
		return EmployeeIDSearch;
	}



	public WebElement getSearchButton() {
		return SearchButton;
	}



	public WebElement getSelectId() {
		return SelectId;
	}



	public WebElement getDeleteButton() {
		return DeleteButton;
	}



	public WebElement getDeleteConfirmButton() {
		return DeleteConfirmButton;
	}



	public WebElement getDashboardLink() {
		return DashboardLink;
	}



	public void AddEmployeeButton() {
		clickOnElement(AddEmployeeButton);
	}
	
	public void SearchEmployee(String Name, String EmployeeId) {
		//clickOnElement(NameSearch);
		//typeInput(NameSearch,Name);
		clickOnElement(EmployeeIDSearch);
		typeInput(EmployeeIDSearch,EmployeeId);
		
	}
	public void SearchButton() {
		clickOnElement(SearchButton);
	}
	
	public void EditPIM() {
		clickOnElement(SelectId);
	}
	
	public void DeletePIM() {
		clickOnElement(DeleteButton);
	}
	
	public void DeleteConfirmation() {
		clickOnElement(DeleteConfirmButton);
	}
	
	public void Dashboard() {
		clickOnElement(DashboardLink);
	}

}
