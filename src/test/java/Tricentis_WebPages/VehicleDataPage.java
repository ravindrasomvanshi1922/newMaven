package Tricentis_WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VehicleDataPage extends SeleniumUtility{
	public VehicleDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"main-navigation\"]/ul/li[1]/a")
	private WebElement autoMobileIcon;
	
	@FindBy(xpath="//select[@id=\"make\"]")
	private WebElement makeField;
	
	@FindBy(xpath="//select[@id=\"make\"]/option")
	private List<WebElement> makeOpt;
	
	@FindBy(xpath="//input[@id=\"engineperformance\"]")
	private WebElement enginePerformanceField;
	
	@FindBy(xpath="//button[@id=\"opendateofmanufacturecalender\"]")
	private WebElement dateOfManuFacture;
	
	@FindBy(xpath="//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[4]/td[4]/a")
	private WebElement dateselect;
	
	@FindBy(xpath="//select[@id=\"numberofseats\"]")
	private WebElement numOfSeats;
	
	@FindBy(xpath="//select[@id=\"numberofseats\"]/option")
	private List<WebElement> numOfSeatsOpt;
	
	@FindBy(xpath="//select[@id=\"fuel\"]")
	private WebElement fuelField;
	
	@FindBy(xpath="//select[@id=\"fuel\"]/option")
	private List<WebElement> fuelOpt;
	
	@FindBy(xpath="//input[@id=\"listprice\"]")
	private WebElement listPrice;
	
	@FindBy(xpath="//input[@id=\"annualmileage\"]")
	private WebElement annualMileage;
	
	@FindBy(xpath="//button[@id=\"nextenterinsurantdata\"]")
	private WebElement nextBtn;
	
//**********************************************************************************************8
	
	public WebElement getAutoMobileIcon() {
		return autoMobileIcon;
	}

	public WebElement getMakeField() {
		return makeField;
	}

	public List<WebElement> getMakeOpt() {
		return makeOpt;
	}

	public WebElement getEnginePerformanceField() {
		return enginePerformanceField;
	}

	public WebElement getDateOfManuFacture() {
		return dateOfManuFacture;
	}
	
	public WebElement getDateselect() {
		return dateselect;
	}

	public WebElement getNumOfSeats() {
		return numOfSeats;
	}

	public List<WebElement> getNumOfSeatsOpt() {
		return numOfSeatsOpt;
	}

	public WebElement getFuelField() {
		return fuelField;
	}

	public List<WebElement> getFuelOpt() {
		return fuelOpt;
	}

	public WebElement getListPrice() {
		return listPrice;
	}

	public WebElement getAnnualMileage() {
		return annualMileage;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}
	
// ******************************************************************************************
	
	public void ClickAutomobile() {
		clickOnElement(autoMobileIcon);
	}
	
	public void MakeOptSelect() {
		clickOnElement(makeField);
		clickOnElement(makeOpt.get(2));
	}
	
	public void EnginePerformanceField(String EnginePerformance) {
		clickOnElement(enginePerformanceField);
		typeInput(enginePerformanceField, EnginePerformance);
	}
	
	public void DateOfManufacture() {
		clickOnElement(dateOfManuFacture);
		clickOnElement(dateselect);
	}
	
	public void NumOfSeatSelect() {
		clickOnElement(numOfSeats);
		clickOnElement(numOfSeatsOpt.get(2));
	}
	
	public void FuelSelect() {
		clickOnElement(fuelField);
		clickOnElement(fuelOpt.get(2));
	}
	
	public void ListPrice(String ListPrice) {
		clickOnElement(listPrice);
		typeInput(listPrice, ListPrice);
	}
	
	public void AnnualMileage(String AnnualMileage) {
		clickOnElement(annualMileage);
		typeInput(annualMileage, AnnualMileage);
	}
	
	public void VehicleDataPage_NextBtn() {
		clickOnElement(nextBtn);
	}
	
}
