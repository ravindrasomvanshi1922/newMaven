package Tricentis_WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class InsurantDataPage extends SeleniumUtility{
	
	public  InsurantDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	private WebElement FirstNameInputFiled;
	
	@FindBy(id="lastname")
	private WebElement LastNameInputFiled;
	
	@FindBy(id="birthdate")
	private WebElement BirthdateField;
	
	@FindBy(xpath="//div[p[label[input[@id=\\\"gendermale\\\"]]]]")
	private WebElement GenderSelect;
	
	@FindBy(id="streetaddress")
	private WebElement StreetAddressField;
	
	@FindBy(id="country")
	private WebElement countryField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[2]/div[6]/select/option")
	private List<WebElement> countryOpt;
	
	@FindBy(id="zipcode")
	private WebElement ZipcodeField;
	
	@FindBy(id="city")
	private WebElement CityField;
	
	@FindBy(id="occupation")
	private WebElement OccupationField;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[2]/div[9]/select/option")
	private List<WebElement> OccupationOpt ;
	
	@FindBy(xpath="//div[p[label[input[@id=\"speeding\"]]]]")
	private WebElement Hobbies;
	
	@FindBy(id="nextenterproductdata")
	private WebElement NextButton;
	
//_______________________________________________________________________________________________
//_______________________________________________________________________________________________
	
	public WebElement getFirstNameInputFiled() {
		return FirstNameInputFiled;
	}

	public WebElement getLastNameInputFiled() {
		return LastNameInputFiled;
	}

	public WebElement getBirthdateField() {
		return BirthdateField;
	}
	
	public WebElement getGenderSelect() {
		return GenderSelect;
	}
	
	public WebElement getStreetAddressField() {
		return StreetAddressField;
	}

	public WebElement getCountryField() {
		return countryField;
	}

	public List<WebElement> getCountryOpt() {
		return countryOpt;
	}

	public WebElement getZipcodeField() {
		return ZipcodeField;
	}

	public WebElement getCityField() {
		return CityField;
	}

	public WebElement getOccupationField() {
		return OccupationField;
	}

	public List<WebElement> getOccupationOpt() {
		return OccupationOpt;
	}

	public WebElement getHobbies() {
		return Hobbies;
	}

	public WebElement getNextButton() {
		return NextButton;
	}
	
//______________________________________________________________________
//______________________________________________________________________
	
	public void FirstNameInputFiled(String FirstName) {
		clickOnElement(FirstNameInputFiled);
		typeInput(FirstNameInputFiled, FirstName);
	}
	
	public void LastNameInputFiled(String LastName) {
	    clickOnElement(LastNameInputFiled);
		typeInput(LastNameInputFiled, LastName);
	}
	
	public void BirthdateField(String Birthdate) {
		clickOnElement(BirthdateField);
		typeInput(BirthdateField, Birthdate);
	}
	
	public void GenderSelect() {
		clickOnElement(GenderSelect);
	}
	
	public void StreetAddressField(String StreetAddress) {
		clickOnElement(StreetAddressField);
		typeInput(StreetAddressField, StreetAddress);
	}
	
	public void countryField() {
		clickOnElement(countryField);
		for(int i = 0; i<countryOpt.size();i++) {
			if(countryOpt.get(i).getText().contains("India")){
				clickOnElement(countryOpt.get(i));
				break;
			}
		}
	}
	
	public void ZipcodeField(String Zipcode) {
		clickOnElement(ZipcodeField);
		typeInput(ZipcodeField, Zipcode);
	}
	
	public void CityField(String City) {
		clickOnElement(CityField);
	}
	
	public void OccupationField() {
		clickOnElement(OccupationField);
		clickOnElement(OccupationOpt.get(1));
	}
	
	public void Hobbies() {
		clickOnElement(Hobbies);
	}
	
	public void NextButton() {
		clickOnElement(NextButton);
	}
	
}
