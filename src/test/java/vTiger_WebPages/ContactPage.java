package vTiger_WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ContactPage extends SeleniumUtility {
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id=\"Contacts_listView_basicAction_LBL_ADD_RECORD\"]")
	private WebElement addContact;
	
	@FindBy(xpath="//a[@title=\"Contacts\"]/h4")
	private WebElement contactlink;
	
	@FindBy(xpath="//input[@name=\"firstname\"]")
	private WebElement firstNameSearch;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement lastNameSearch;
	
	@FindBy(xpath="//button[@class=\"btn btn-success btn-sm\"]")
	private WebElement searchBtn;
	
	@FindBy(xpath="//input[@class=\"listViewEntriesMainCheckBox\"]")
	private WebElement firstCheckBox;
	
	@FindBy(xpath="//button[@id=\"Contacts_listView_massAction_LBL_EDIT\"]")
	private WebElement editBtn;
	
	@FindBy(xpath="//button[@id=\"Contacts_listView_massAction_LBL_DELETE\"]")
	private WebElement deleteBtn;
	
	@FindBy(xpath="//div[@class=\"modal-footer\"]/button[2]")
	private WebElement deleteYesBtn;
	
	@FindBy(xpath="//tbody[@class=\"overflow-y\"]/tr/td/div")
	private WebElement msg;
	
	@FindBy(xpath="//tbody[@class=\"overflow-y\"]/tr[1]/td[2]/span[1]/span/a")
	private WebElement searchresult;
	
	@FindBy(xpath="//tbody[@class=\"overflow-y\"]/tr[1]/td[4]/span/span")
	private  WebElement updatedTitle;
	
	public WebElement getSearchresult() {
		return searchresult;
	}

	public WebElement getAddContact() {
		return addContact;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getUpdatedTitle() {
		return updatedTitle;
	}

	public WebElement getFirstNameSearch() {
		return firstNameSearch;
	}

	public WebElement getLastNameSearch() {
		return lastNameSearch;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getFirstCheckBox() {
		return firstCheckBox;
	}

	public WebElement getDeleteYesBtn() {
		return deleteYesBtn;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	

	
//**********************************************************
	public void AddContact() {
		clickOnElement(addContact);
	}
	
	public void ContactLink() {
		clickOnElement(contactlink);
	}
	
	public void FirstName(String FirstName) {
		clickOnElement(firstNameSearch);
		typeInput(firstNameSearch, FirstName);
	}
	
	public void LastName(String LastName) {
		clickOnElement(lastNameSearch);
		typeInput(lastNameSearch, LastName);
	}
	
	public void SearchBtn() {
		clickOnElement(searchBtn);
	}
	
	public void FirstCheckBox() {
		clickOnElement(firstCheckBox);
	}
	
	public void EditBtn() {
		clickOnElement(editBtn);
	}
	
	public void DeleteBtn() {
		clickOnElement(deleteBtn);
	}
	
	public void DeleteYesBtn() {
		clickOnElement(deleteYesBtn);
	}
	
	public String NoContactMsg() {
		return getTextForElement(msg);
	}
	
	public String SearchResultMsg() {
		return getTextForElement(searchresult);
	}
	
	public String UpdatedTitleText() {
		return getTextForElement(updatedTitle);
	}
}
