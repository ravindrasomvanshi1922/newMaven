package StepDefination;

import org.openqa.selenium.WebDriver;

import Tricentis_WebPages.InsurantDataPage;
import Tricentis_WebPages.PriceOptionPage;
import Tricentis_WebPages.ProductDataPage;
import Tricentis_WebPages.SendQuotesPage;
import Tricentis_WebPages.VehicleDataPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class Tricentis extends SeleniumUtility{
	
	WebDriver driver;
	VehicleDataPage getVehicleDataPage;
	InsurantDataPage getInsurantDataPage;
	ProductDataPage getProductDataPage;
	PriceOptionPage getPriceOptionPage;
	SendQuotesPage getSendQuotesPage;
	
	
	@Given("user is already loggedIn")
	public void user_is_already_logged_in() {
		driver = setUp("Chrome", "https://sampleapp.tricentis.com/101/app.php");
		
		getVehicleDataPage = new VehicleDataPage(driver); 
		getInsurantDataPage = new InsurantDataPage(driver);
		getProductDataPage = new ProductDataPage(driver);
		getPriceOptionPage = new PriceOptionPage(driver);
		getSendQuotesPage = new SendQuotesPage(driver);
	}

	@When("user select Make and Model Opt")
	public void user_select_make_and_model_opt() {
	    getVehicleDataPage.MakeFieldData();
	    getVehicleDataPage.ModelFieldData();
	}

	@When("select cylindercapacity {string} and engineperformance {string} and select dateofmanufacture")
	public void select_cylindercapacity_and_engineperformance(String string, String string2) {
		getVehicleDataPage.CylinderCapacityField("500");
		getVehicleDataPage.EnginePerformanceField("60");
		getVehicleDataPage.DateOfManufactureField();
	}

	@When("numberofseats")
	public void numberofseats() {
		getVehicleDataPage.NumOfSeatsMotorCyclel();
	}

	@Then("user select fueltype and Payload {string}")
	public void user_select_fueltype_and_payload(String string) {
		getVehicleDataPage.FuelFiled();
		getVehicleDataPage.PayloadField("50");
	}

	@Then("select totalweight {string} and listprice {string}")
	public void select_totalweight_and_listprice(String string, String string2) {
		getVehicleDataPage.TotalWeightField("100");
		getVehicleDataPage.ListpriceFiled("100000");
	}

	@Then("select annualmileage {string} and click on the NextButton")
	public void select_annualmileage_and_click_on_the_next_button(String string) {
		getVehicleDataPage.AnnualMileageFiled("2000");
		getVehicleDataPage.NextButton();
		
	}

	@When("user fill FirstName {string} and LastName {string}")
	public void user_fill_first_name_and_last_name(String string, String string2) {
	   getInsurantDataPage.FirstNameInputFiled("Ravindra");
	   getInsurantDataPage.LastNameInputFiled("Somvanshi");
	}

	@When("select Date Of Birth {string} and Gender")
	public void select_date_of_birth_and_gender(String string) {
		getInsurantDataPage.BirthdateField("05/19/2002");
		getInsurantDataPage.GenderSelect();
	}

	@When("select Street address {string}")
	public void select_street_address(String string) {
		getInsurantDataPage.StreetAddressField("AT.POST BAMBRUD BK");
	}

	@Then("user select country and zipcode {string}")
	public void user_select_country_and_zipcode(String string, String string2) {
		getInsurantDataPage.countryField();
		getInsurantDataPage.ZipcodeField("424242");
	}

	@Then("city {string} and occupation")
	public void city_and_occupation(String string) {
		getInsurantDataPage.CityField("Jalgaon");
		getInsurantDataPage.OccupationField();
	}

	@Then("hobbies and click on the NextButton")
	public void hobbies_and_click_on_the_next_button() {
		getInsurantDataPage.Hobbies();
		getInsurantDataPage.NextButton();
	}

	@When("user select StartDate {string}")
	public void user_select_start_date(String string) {
	    getProductDataPage.StartDateField("01/08/2024");
	}

	@When("select Insurance Sum [$] and Merit Rating")
	public void select_insurance_sum_$_and_merit_rating() {
		getProductDataPage.InsuranceSumField();
		getProductDataPage.MeritratingField();
	}

	@Then("user select Damage Insurance and Optional Products")
	public void user_select_damage_insurance_and_optional_products() {
		getProductDataPage.DamageInsuranceField();
		getProductDataPage.OptionalProduct();
	}

	@Then("select Courtesy Car and NextButton")
	public void select_courtesy_car_and_next_button() {
		getProductDataPage.CourtesyCarFied();
		getProductDataPage.NextButton();
	}

	@When("user select Price option")
	public void user_select_price_option() {
	    getPriceOptionPage.PriceOption();
	}

	@Then("select NextButton")
	public void select_next_button() {
		getPriceOptionPage.NextButton();
	}

	@When("user fill Email {string}")
	public void user_fill_email(String string) {
	    getSendQuotesPage.EmailField("abc@gmail.com");
	}

	@When("fill Username {string} and Password {string}")
	public void fill_username_and_password(String string, String string2) {
		getSendQuotesPage.UsernameField("ravindra");
		getSendQuotesPage.PasswordField("Ravi@22");
	}

	@Then("user fill Confirm Password {string}")
	public void user_fill_confirm_password(String string) {
		getSendQuotesPage.ConfirmPasswordField("Ravi@22");
	}

	@Then("click on the SendButton")
	public void click_on_the_send_button() {
		getSendQuotesPage.SendeMailButton();
	}
}
