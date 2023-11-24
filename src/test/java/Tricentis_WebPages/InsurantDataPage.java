package Tricentis_WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class InsurantDataPage extends SeleniumUtility{
	public InsurantDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id=\"firstname\"]")
	private WebElement firstNameInputField;
	
	@FindBy(xpath="//input[@id=\"lastname\"]")
	private WebElement lastNameInputField;
	
	@FindBy(xpath="//input[@id=\"birthdate\"]")
	private WebElement birthDate;
	
	@FindBy(xpath="//input[@id=\"gendermale\"]")
	private WebElement genderSelect;
	
	@FindBy(xpath="//input[@id=\"streetaddress\"]")
	private WebElement streetAddress;
	
	@FindBy(xpath="//select[@id=\"country\"]")
	private WebElement country;
	
	@FindBy(xpath="//select[@id=\"country\"]/option")
	private List<WebElement> countryOpt;
	
	@FindBy(xpath="//input[@id=\"zipcode\"]")
	private WebElement zipCode;
	
	@FindBy(xpath="//input[@id=\"city\"]")
	private WebElement cityField;
	
	@FindBy(xpath="//select[@id=\"occupation\"]")
	private WebElement occupation;
	
	@FindBy(xpath="//select[@id=\"occupation\"]/option")
	private List<WebElement> occupationOpt;
	
	@FindBy(xpath="//div[@class=\"idealsteps-wrap\"]/section[2]/div[10]/p/label")
	private List<WebElement> hobbiesOpt;
	
	@FindBy(xpath="//button[@id=\"nextenterproductdata\"]")
	private WebElement nextBtn;

	public WebElement getFirstNameInputField() {
		return firstNameInputField;
	}

	public WebElement getLastNameInputField() {
		return lastNameInputField;
	}

	public WebElement getBirthDate() {
		return birthDate;
	}

	public WebElement getGenderSelect() {
		return genderSelect;
	}

	public WebElement getStreetAddress() {
		return streetAddress;
	}

	public WebElement getCountry() {
		return country;
	}

	public List<WebElement> getCountryOpt() {
		return countryOpt;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public List<WebElement> getOccupationOpt() {
		return occupationOpt;
	}

	public List<WebElement> getHobbiesOpt() {
		return hobbiesOpt;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}
	
//**********************************************************************************
	
	public void FirstName(String FirstName) {
		clickOnElement(firstNameInputField);
		typeInput(firstNameInputField, FirstName);
	}
	
	public void LastName(String LastName) {
		clickOnElement(lastNameInputField);
		typeInput(lastNameInputField, LastName);
	}
	
	public void DOB(String DateOfBirth) {
		clickOnElement(birthDate);
		typeInput(birthDate, DateOfBirth);
	}
	
	public void Gender() {
		clickOnElement(genderSelect);
	}
	public void StreetAddress(String StreetAddress) {
		clickOnElement(streetAddress);
		typeInput(streetAddress, StreetAddress);
	}
	
	public void Country() {
		clickOnElement(country);
		for(int i = 0; i<countryOpt.size(); i++) {
			if(countryOpt.get(i).getText().contains("India")) {
				clickOnElement(countryOpt.get(i));
				break;
			}
		}
	}
	
	public void ZipCode(String ZipCode) {
		clickOnElement(zipCode);
		typeInput(zipCode, ZipCode);
	}
	
	public void City(String City) {
		clickOnElement(cityField);
		typeInput(cityField, City);
	}
	
	public void Occupation() {
		clickOnElement(occupation);
		clickOnElement(occupationOpt.get(1));
	}
	
	public void Hobbies() {
		clickOnElement(hobbiesOpt.get(0));
		clickOnElement(hobbiesOpt.get(1));
	}
	
	public void InsurantDataPage_NextBtn() {
		clickOnElement(nextBtn);
	}

}
