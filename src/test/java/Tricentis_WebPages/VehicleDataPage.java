package Tricentis_WebPages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VehicleDataPage extends SeleniumUtility{
	

	public  VehicleDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="make")
	private WebElement MakeField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[1]/div[1]/select/option")
	private List<WebElement> MakeOpt;
	
	@FindBy(id="model")
	private WebElement ModelField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[1]/div[2]/select/option")
	private List<WebElement> ModelOpt;
	
	@FindBy(id="cylindercapacity")
	private WebElement CylinderCapacityField;
	
	@FindBy(id="engineperformance")
	private WebElement EnginePerformanceField;
	
	@FindBy(id="opendateofmanufacturecalender")
	private WebElement DateOfManufactureIcon;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a")
	private WebElement DatePicker;
	
	@FindBy(id="numberofseats")
	private WebElement NumOfSeat;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[1]/div[6]/select/option")
	private List<WebElement> NumOfSeatOpt;
	
	@FindBy(id="numberofseatsmotorcycle")
	private WebElement NumOfSeatsMotorCycle1;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[1]/div[8]/select/option")
	private List<WebElement> NumOfSeatsMotorCycleOpt;
	
	@FindBy(id="fuel")
	private WebElement FuelFiled;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[1]/div[9]/select/option")
	private List<WebElement> FuelFiledOpt;
	
	@FindBy(id="payload")
	private WebElement PayloadField;
	
	@FindBy(id="totalweight")
	private WebElement TotalWeightField;
	
	@FindBy(id="listprice")
	private WebElement ListpriceFiled;
	
	@FindBy(id="annualmileage")
	private WebElement AnnualMileageFiled;
	
	@FindBy(id="nextenterinsurantdata")
	private WebElement NextButton;

//________________________________________________________________________________________________
//________________________________________________________________________________________________
	
	public WebElement getMakeField() {
		return MakeField;
	}

	public List<WebElement> getMakeOpt() {
		return MakeOpt;
	}

	public WebElement getModelField() {
		return ModelField;
	}

	public List<WebElement> getModelOpt() {
		return ModelOpt;
	}

	public WebElement getCylinderCapacityField() {
		return CylinderCapacityField;
	}

	public WebElement getEnginePerformanceField() {
		return EnginePerformanceField;
	}

	public WebElement getDateOfManufactureIcon() {
		return DateOfManufactureIcon;
	}
	
	public WebElement DatePicker() {
		return DatePicker;
	}

	public WebElement getNumOfSeat() {
		return NumOfSeat;
	}

	public List<WebElement> getNumOfSeatOt() {
		return NumOfSeatOpt;
	}

	public WebElement getNumOfSeatsMotorCycle1() {
		return NumOfSeatsMotorCycle1;
	}

	public List<WebElement> getNumOfSeatsMotorCycleOPt() {
		return NumOfSeatsMotorCycleOpt;
	}

	public WebElement getFuelFiled() {
		return FuelFiled;
	}

	public List<WebElement> getFuelFiledOpt() {
		return FuelFiledOpt;
	}

	public WebElement getPayloadField() {
		return PayloadField;
	}

	public WebElement getTotalWeightField() {
		return TotalWeightField;
	}

	public WebElement getListpriceFiled() {
		return ListpriceFiled;
	}

	public WebElement getAnnualMileageFiled() {
		return AnnualMileageFiled;
	}

	public WebElement getNextButton() {
		return NextButton;
	}

//_______________________________________________________________________________
//_______________________________________________________________________________
		
	public void MakeFieldData() {
		clickOnElement(MakeField);
		clickOnElement(MakeOpt.get(2));
	}
	
	public void ModelFieldData() {
		clickOnElement(ModelField);
		clickOnElement(ModelOpt.get(1));
	}
	
	public void CylinderCapacityField(String CylinderCapacity ) {
		clickOnElement(CylinderCapacityField);
		typeInput(CylinderCapacityField, CylinderCapacity);
	}
	
	public void EnginePerformanceField(String EnginePerformance ) {
		clickOnElement(EnginePerformanceField);
		typeInput(EnginePerformanceField, EnginePerformance);
	}
	
	public void DateOfManufactureField() {
		clickOnElement(DateOfManufactureIcon);
		clickOnElement(DatePicker);
		
	}
	
	public void NumOfSeat() {
		clickOnElement(NumOfSeat);
		clickOnElement(NumOfSeatOpt.get(2));
	}
	
	public void NumOfSeatsMotorCyclel() {
		clickOnElement(NumOfSeatsMotorCycle1);
		clickOnElement(NumOfSeatsMotorCycleOpt.get(2));
	}
	
	public void FuelFiled() {
		clickOnElement(FuelFiled);
		clickOnElement(FuelFiledOpt.get(1));
	}
	
	public void PayloadField(String Payload ) {
		clickOnElement(PayloadField);
		typeInput(PayloadField, Payload);
	}
	
	public void TotalWeightField(String TotalWeight ) {
		clickOnElement(TotalWeightField);
		typeInput(TotalWeightField, TotalWeight);
	}
	
	public void ListpriceFiled(String Listprice ) {
		clickOnElement(ListpriceFiled);
		typeInput(ListpriceFiled, Listprice);
	}
	
	public void AnnualMileageFiled(String AnnualMileage ) {
		clickOnElement(AnnualMileageFiled);
		typeInput(AnnualMileageFiled, AnnualMileage);
	}
	
	public void NextButton(){
		clickOnElement(NextButton);
		
	}

}
