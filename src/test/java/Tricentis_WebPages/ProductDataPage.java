package Tricentis_WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ProductDataPage extends SeleniumUtility{
	public ProductDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="startdate")
	private WebElement StartDateField;
	
	@FindBy(id="insurancesum")
	private WebElement InsuranceSumField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[3]/div[2]/select/option")
	private List<WebElement> InsuranceSumOpt;
	
	@FindBy(id="meritrating")
	private WebElement MeritratingField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[3]/div[3]/select/option")
	private List<WebElement> MeritratingOpt;
	
	@FindBy(id="damageinsurance")
	private WebElement DamageInsuranceField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[3]/div[4]/select/option")
	private List<WebElement> DamageinsuranceOpt;
	
	@FindBy(xpath="//div[p[label[input[@id=\"EuroProtection\"]]]]")
	private WebElement OptionalProduct;
	
	@FindBy(id="courtesycar")
	private WebElement CourtesyCarField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[3]/div[6]/select/option")
	private List<WebElement> CourtesyCarOpt;
	
	@FindBy(id="nextselectpriceoption")
	private WebElement NextButton;
	
//_____________________________________________________________________________________________
//_____________________________________________________________________________________________

	public WebElement getStartDate() {
		return StartDateField;
	}

	public WebElement getInsuranceSumField() {
		return InsuranceSumField;
	}

	public List<WebElement> getInsuranceSumOpt() {
		return InsuranceSumOpt;
	}

	public WebElement getMeritratingField() {
		return MeritratingField;
	}

	public List<WebElement> getMeritratingOpt() {
		return MeritratingOpt;
	}

	public WebElement getDamageInsuranceField() {
		return DamageInsuranceField;
	}

	public List<WebElement> getDamageinsuranceOpt() {
		return DamageinsuranceOpt;
	}

	public WebElement getOptionalProduct() {
		return OptionalProduct;
	}

	public WebElement getCourtesyCarFied() {
		return CourtesyCarField;
	}

	public List<WebElement> getCourtesyCarOpt() {
		return CourtesyCarOpt;
	}

	public WebElement getNextButton() {
		return NextButton;
	}
	
//____________________________________________________________________________________________
//____________________________________________________________________________________________
	
	public void StartDateField(String StartDate) {
		clickOnElement(StartDateField);
	}
	
	public void InsuranceSumField() {
		clickOnElement(InsuranceSumField);
		clickOnElement(InsuranceSumOpt.get(2));
	}
	
	public void MeritratingField() {
		clickOnElement(MeritratingField);
		clickOnElement(MeritratingOpt.get(2));
	}
	
	public void DamageInsuranceField() {
		clickOnElement(DamageInsuranceField);
		clickOnElement(DamageinsuranceOpt.get(2));
	}
	
	public void OptionalProduct() {
		clickOnElement(OptionalProduct);
	}
	
	public void CourtesyCarFied() {
		clickOnElement(CourtesyCarField);
		clickOnElement(CourtesyCarOpt.get(2));
	}
	
	public void NextButton() {
		clickOnElement(NextButton);
	}
	

}
