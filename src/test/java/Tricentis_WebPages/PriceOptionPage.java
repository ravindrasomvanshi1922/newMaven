package Tricentis_WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PriceOptionPage extends SeleniumUtility{
	public  PriceOptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tfoot[tr[th[label[input[@id\"selectsilver\"]]]]]")
	private WebElement PriceOption;
	
	@FindBy(id="nextsendquote")
	private WebElement NextButton;

	public WebElement getPriceOption() {
		return PriceOption;
	}

	public WebElement getNextButton() {
		return NextButton;
	}
	
	public void PriceOption() {
		clickOnElement(PriceOption);
	}
	
	public void NextButton() {
		clickOnElement(NextButton);
	}

}
