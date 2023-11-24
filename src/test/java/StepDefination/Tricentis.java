package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
	
	@Given("User is already in vehicle data page")
	public void user_is_already_in_vehicle_data_page() {
	    driver = setUp("Chrome", "https://sampleapp.tricentis.com/101/app.php");
	    
		
		  getVehicleDataPage = new VehicleDataPage(driver);
		  getInsurantDataPage = new InsurantDataPage(driver);
		  getProductDataPage = new ProductDataPage(driver);
		  getPriceOptionPage = new PriceOptionPage(driver); 
		  getSendQuotesPage = new SendQuotesPage(driver);
		 
	    
	    String ActTitle = getCurrentPageTitle();
	    String ExpTitle = "Enter Vehicle Data";
	    Assert.assertEquals(ActTitle, ExpTitle);
	   
	}

	@When("user click on AutoMobile link")
	public void user_click_on_auto_mobile_link() {
		getVehicleDataPage.ClickAutomobile();
	}

	@When("user select Make option and enter EnginePerformance [kW]")
	public void user_select_make_option_and_enter_engine_performance_k_w() {
	    getVehicleDataPage.MakeOptSelect();
	    getVehicleDataPage.EnginePerformanceField("515");
	}

	@When("user select DateOfManufacture and NumberOfSeats")
	public void user_select_date_of_manufacture_and_number_of_seats() {
	    getVehicleDataPage.DateOfManufacture();
	    getVehicleDataPage.NumOfSeatSelect();
	}

	@When("user select Fuel Type and enter List Price [$]")
	public void user_select_fuel_type_and_enter_list_price_$() {
	    getVehicleDataPage.FuelSelect();
	    getVehicleDataPage.ListPrice("100000");
	}

	@When("user enter Annual Mileage [mi]")
	public void user_enter_annual_mileage_mi() {
	    getVehicleDataPage.AnnualMileage("1000");
	}

	@When("click on VehicleDataPage Next button")
	public void click_on_vehicle_data_page_next_button() {
	    getVehicleDataPage.VehicleDataPage_NextBtn();
	}

	@Then("Verify user is on InsurantDataPage")
	public void verify_user_is_on_insurant_data_page() {
	    String ActTitle = getCurrentPageTitle();
	    String ExpTitle = "Enter Insurant Data";
	    Assert.assertEquals(ActTitle, ExpTitle);
	}

	@When("user enter FirstName and LastName")
	public void user_enter_first_name_and_last_name() {
	    getInsurantDataPage.FirstName("Vivek");
	    getInsurantDataPage.LastName("Patil");
	}

	@When("select DateofBirth")
	public void select_dateof_birth() {
	    getInsurantDataPage.DOB("05/19/2002");
	}

	@When("enter StreetAddress and select Country")
	public void enter_street_address_and_select_country() {
	    getInsurantDataPage.StreetAddress("AT.POST BAMBRUD BK");
	    getInsurantDataPage.Country();
	}

	@When("enter Zipcode and City")
	public void enter_zipcode_and_city() {
	    getInsurantDataPage.ZipCode("424201");
	    getInsurantDataPage.City("Jalgaon");
	}

	@When("select Occupation and Hobbies")
	public void select_occupation_and_hobbies() {
	    getInsurantDataPage.Occupation();
	    getInsurantDataPage.Hobbies();
	}

	@When("click on InsurantData Next button")
	public void click_on_insurant_data_next_button() {
	    getInsurantDataPage.InsurantDataPage_NextBtn();
	}
	
	@Then("Verify user is on ProductDataPage")
	public void verify_user_is_on_product_data_page() {
		String ActTitle = getCurrentPageTitle();
	    String ExpTitle = "Enter Product Data";
	    Assert.assertEquals(ActTitle, ExpTitle);
	}

	@When("user select StartDate and InsuranceSum [$]")
	public void user_select_start_date_and_insurance_sum_$() {
	    getProductDataPage.StartDateSelect("02/22/2024");
	    getProductDataPage.InsuranceSum();
	}

	@When("select MeritRating and DamageInsurance")
	public void select_merit_rating_and_damage_insurance() {
	    getProductDataPage.MeritRating();
	    getProductDataPage.DamageInsurance();
	}

	@When("select Optional Products and CourtesyCar")
	public void select_optional_products_and_courtesy_car() {
	    getProductDataPage.OptionalProduct();
	    getProductDataPage.CourtesyCar();
	}

	@When("click on ProductData Next button")
	public void click_on_product_data_next_button() {
	    getProductDataPage.ProductDataPage_NextBtn();
	}
	
	@Then("Verify user is on PriceOptionPage")
	public void verify_user_is_on_price_option_page() {
		String ActTitle = getCurrentPageTitle();
	    String ExpTitle = "Select Price Option";
	    Assert.assertEquals(ActTitle, ExpTitle);
	}

	@When("user select required option")
	public void user_select_required_option() {
	    getPriceOptionPage.PriceOptionSelect();
	}

	@When("click on PriceOption Next button")
	public void click_on_price_option_next_button() {
	    getPriceOptionPage.PriceOptionPage_NextBtn();
	}
	
	@Then("Verify user is on SendQuotesPage")
	public void verify_user_is_on_send_quotes_page() {
		String ActTitle = getCurrentPageTitle();
	    String ExpTitle = "Send Quote";
	    Assert.assertEquals(ActTitle, ExpTitle);
	}

	@When("user enter Email and UserName")
	public void user_enter_email_and_user_name() {
	   getSendQuotesPage.EMail("abc@gmail.com");
	   getSendQuotesPage.UserName("ravindra");
	}

	@When("enter Password and ConfirmPassword")
	public void enter_password_and_confirm_password() {
	    getSendQuotesPage.Password("Ravi@22");
	    getSendQuotesPage.ConfirmPassword("Ravi@22");
	}

	@When("click on the Send button")
	public void click_on_the_send_button() {
	    getSendQuotesPage.SendBtn();
	}

	@Then("verify Email is Send or not")
	public void verify_email_is_send_or_not() {
	    String ActMsg = getSendQuotesPage.MailMsg();
	    String ExpMsg = "Sending e-mail success!";
	    Assert.assertEquals(ActMsg, ExpMsg);
	}

	@Then("click on ok button")
	public void click_on_ok_button() {
	    getSendQuotesPage.OkBtn();
	}
	
		
}