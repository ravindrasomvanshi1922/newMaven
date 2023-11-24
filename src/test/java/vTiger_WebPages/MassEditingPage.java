package vTiger_WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class MassEditingPage extends SeleniumUtility{
	public MassEditingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"Contacts_editView_fieldName_title\"]")
	private WebElement title;
	
	@FindBy(xpath="//button[@class=\"btn btn-success saveButton\"]")
	private WebElement saveBtn;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
//***********************************************************************
	
	public void Title(String Title) {
		clickOnElement(title);
		typeInput(title, Title);
	}
	
	public void SaveBtn() {
		clickOnElement(saveBtn);
	}

}
