package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import OrangeHRM_WebPages.AddEmployeePage;
import OrangeHRM_WebPages.EmployeePersonalDetailsPage;
import OrangeHRM_WebPages.HomePage;
import OrangeHRM_WebPages.LoginPage;
import OrangeHRM_WebPages.PIMhomePage;


public class OrangeHRM extends SeleniumUtility{
	WebDriver driver;
	LoginPage getLoginPage;
	HomePage getHomePage;
	PIMhomePage getPIMhomePage;
	AddEmployeePage getAddEmployeePage;
	EmployeePersonalDetailsPage getEmployeePersonalDetailsPage;
	
	
	@Given("user is already loggen in")
	public void user_is_already_loggen_in() {
	    driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    getLoginPage = new LoginPage(driver);
	    getHomePage = new HomePage(driver);
	    getPIMhomePage = new PIMhomePage(driver);
	    getAddEmployeePage = new AddEmployeePage(driver);
	    getEmployeePersonalDetailsPage = new EmployeePersonalDetailsPage(driver);
	    
	    getLoginPage.UserName("Admin");
	    getLoginPage.Password("admin123");
	    getLoginPage.LoginButton();
	    
	}

	@When("user click on PIM link")
	public void user_click_on_pim_link() {
	   getHomePage.PIMLink();
	}

	@When("click on the AddEmployee button")
	public void click_on_the_add_employee_button() {
	    getPIMhomePage.AddEmployeeButton();
	}

	@When("FirstName {string} and LastName {string}")
	public void first_name_and_last_name(String string, String string2) {
	    getAddEmployeePage.AddEmployeePage("Rohit", "Sharma");
	}

	@When("EmployeeId {string}")
	public void employee_id(String string) {
	    getAddEmployeePage.AddEmpID("4545");
	}

	@Then("Click on save button")
	public void click_on_save_button_() {
		setSleepTime(2000);
	   getAddEmployeePage.SaveButton();
	}

	@Then("click on PIM link")
	public void click_on_pim_link() {
	    getHomePage.PIMLink();
	}

	@When("User Search FirstName {string} and EmployeeId {string}")
	public void user_search_first_name_and_employee_id(String string, String string2) {
	   getPIMhomePage = new PIMhomePage(driver);
	   getPIMhomePage.SearchEmployee("Rohit", "4545");
	}

	@When("click on the search button")
	public void click_on_the_search_button() {
	    getPIMhomePage.SearchButton();
	}

	@When("click on required Searched EmployeeId")
	public void click_on_required_searched_employee_id() {
	    getPIMhomePage.EditPIM();
	}

	@Then("Add Liscence Number {string}")
	public void add_liscence_number(String string) {
	   getEmployeePersonalDetailsPage.EditDetails("3285");
	}

	@Then("click on save button")
	public void click_on_save_button() {
	   getEmployeePersonalDetailsPage.saveButton();
	}

	@Then("click on the PIM link")
	public void click_on_the_pim_link() {
	    getHomePage.PIMLink();
	}

	@Then("Select EmployeeId and click on the Delete icon")
	public void select_employee_id_and_click_on_the_delete_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on the DeleteConfirmation button")
	public void click_on_the_delete_confirmation_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
