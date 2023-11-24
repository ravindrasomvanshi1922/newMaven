package vTiger_WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class AddingNewPage extends SeleniumUtility{
	public AddingNewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id=\"s2id_autogen1\"]/a/span[2]/b")
	private WebElement noneBtn;
	
	@FindBy(xpath="//ul[@id=\"select2-results-2\"]/li")
	private List<WebElement> noneDrp;
	
	@FindBy(xpath="//input[@id=\"Contacts_editView_fieldName_firstname\"]")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id=\"Contacts_editView_fieldName_lastname\"]")
	private WebElement lastName;
	
	@FindBy(xpath="//button[@class=\"btn btn-success saveButton\"]")
	private WebElement saveBtn;

	public WebElement getNoneBtn() {
		return noneBtn;
	}

	public List<WebElement> getNoneDrp() {
		return noneDrp;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
//*********************************************************
	
	public void NoneSelect() {
		clickOnElement(noneBtn);
		clickOnElement(noneDrp.get(1));
	}
	
	public void FirstName(String FirstName) {
		clickOnElement(firstName);
		typeInput(firstName, FirstName);
	}
	
	public void LastName(String LastName) {
		clickOnElement(lastName);
		typeInput(lastName, LastName);
	}
	
	public void SaveBtn() {
		clickOnElement(saveBtn);
	}
}
