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
	
	@FindBy(xpath="//input[@id=\"startdate\"]")
	private WebElement StartDate;
	
	@FindBy(xpath="//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[4]/td[5]/a")
	private WebElement StartDatePicker;
	
	@FindBy(xpath="//select[@id=\"insurancesum\"]")
	private WebElement insuranceSum;
	
	@FindBy(xpath="//select[@id=\"insurancesum\"]/option")
	private List<WebElement> insuranceSumOpt;
	
	@FindBy(xpath="//select[@id=\"meritrating\"]")
	private WebElement meritRating;
	
	@FindBy(xpath="//select[@id=\"meritrating\"]/option")
	private List<WebElement> meritRatingOpt;
	
	@FindBy(xpath="//select[@id=\"damageinsurance\"]")
	private WebElement damageInsurance;
	
	@FindBy(xpath="//select[@id=\"damageinsurance\"]/option")
	private List<WebElement> damageInsuranceOpt;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[3]/div[5]/p/label/span")
	private List<WebElement> optionalProducts;
	
	@FindBy(xpath="//select[@id=\"courtesycar\"]")
	private WebElement courtesyCar;
	
	@FindBy(xpath="//select[@id=\"courtesycar\"]/option")
	private List<WebElement> courtesyCarOpt;
	
	@FindBy(xpath="// button[@id=\"nextselectpriceoption\"]")
	private WebElement nextBtn;

	public WebElement getStartDate() {
		return StartDate;
	}

	public WebElement getDatePicker() {
		return StartDatePicker;
	}

	public WebElement getInsuranceSum() {
		return insuranceSum;
	}

	public List<WebElement> getInsuranceSumOpt() {
		return insuranceSumOpt;
	}

	public WebElement getMeritRating() {
		return meritRating;
	}

	public List<WebElement> getMeritRatingOpt() {
		return meritRatingOpt;
	}

	public WebElement getDamageInsurance() {
		return damageInsurance;
	}

	public List<WebElement> getDamageInsuranceOpt() {
		return damageInsuranceOpt;
	}

	public List<WebElement> getOptionalProducts() {
		return optionalProducts;
	}

	public WebElement getCourtesyCar() {
		return courtesyCar;
	}

	public List<WebElement> getCourtesyCarOpt() {
		return courtesyCarOpt;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

//******************************************************************************
	
	public void StartDateSelect(String startDate) {
		clickOnElement(StartDate);
		typeInput(StartDate, startDate);
	}
	
	public void InsuranceSum() {
		clickOnElement(insuranceSum);
		clickOnElement(insuranceSumOpt.get(4));
	}
	
	public void MeritRating() {
		clickOnElement(meritRating);
		clickOnElement(meritRatingOpt.get(1));
	}
	
	public void DamageInsurance() {
		clickOnElement(damageInsurance);
		clickOnElement(damageInsuranceOpt.get(2));
	}
	
	public void OptionalProduct() {
		clickOnElement(optionalProducts.get(1));
	}
	
	public void CourtesyCar() {
		clickOnElement(courtesyCar);
		clickOnElement(courtesyCarOpt.get(1));
	}
	
	public void ProductDataPage_NextBtn() {
		clickOnElement(nextBtn);
	}
	
}
