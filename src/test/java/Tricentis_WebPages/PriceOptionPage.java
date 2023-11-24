package Tricentis_WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PriceOptionPage extends SeleniumUtility{
	public PriceOptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")
	private WebElement priceOption;
	
	@FindBy(xpath="//button[@id=\"nextsendquote\"]")
	private WebElement nextBtn;

	public WebElement getPriceOption() {
		return priceOption;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}
	
//********************************************************************
	
	public void PriceOptionSelect() {
		clickOnElement(priceOption);
	}
	
	public void PriceOptionPage_NextBtn() {
		clickOnElement(nextBtn);
	}

}
