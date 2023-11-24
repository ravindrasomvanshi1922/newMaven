package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.beust.jcommander.internal.Sets;

import OrangeHRM_Webages.AddEmployeePage;
import OrangeHRM_Webages.EmpPersonalDetail_Page;
import OrangeHRM_Webages.HomePage;
import OrangeHRM_Webages.LoginPage;
import OrangeHRM_Webages.PIM_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class OrangeHRm extends SeleniumUtility {
	
	WebDriver driver;
	LoginPage getLoginPage;
	HomePage getHomePage;
	PIM_HomePage getPIM_HomePage;
	AddEmployeePage getAddEmployeePage;
	EmpPersonalDetail_Page getEmpPersonalDetail_Page;
	
	@Given("User is already login with valid credentials")
	public void user_is_already_login_with_valid_credentials() {
	    driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	    
	    getLoginPage = new LoginPage(driver);
	    getHomePage = new HomePage(driver);
	    getPIM_HomePage = new PIM_HomePage(driver);
	    getAddEmployeePage = new AddEmployeePage(driver);
	    getEmpPersonalDetail_Page = new EmpPersonalDetail_Page(driver);
	    
	    getLoginPage.LogIntoApplication("Admin", "admin123");
	}

	@Given("click on the PIM Link")
	public void click_on_the_pim_link() {
	    getHomePage.ClickPIM();
	}

	@When("user click on the addButton")
	public void user_click_on_the_add_button() {
	    getPIM_HomePage.AddEmpBtn();
	}

	@When("enter firstName,lastName and empId and click on save button")
	public void enter_first_name_last_name_and_emp_id_and_click_on_save_button() {
	    getAddEmployeePage.CreateEmp("Rohit", "Sharma", "2640");
	    getAddEmployeePage.EmpID_saveBtn();
	    getHomePage.ClickPIM();
	}

	@When("Search created EmpId in EmpIdField")
	public void search_created_emp_id_in_emp_id_field() {
	   getPIM_HomePage.SearchEmpId("2640");
	   getPIM_HomePage.SearchButton();
	}

	@Then("user able to search create EmployeeId")
	public void user_able_to_search_create_employee_id() {
		setSleepTime(2000);
	    String ActualMsg = getPIM_HomePage.getSearchResultMsg();
	    String ExpectedMsg = "(1) Record Found";
	    Assert.assertEquals(ActualMsg, ExpectedMsg);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    getHomePage.CloseBrowser();
	}

	@When("user enter created EmpId in EmpId field")
	public void user_enter_created_emp_id_in_emp_id_field() {
	    getPIM_HomePage.SearchEmpId("2640");
	}

	@When("click on search button")
	public void click_on_search_button() {
		getPIM_HomePage.SearchButton();
	}

	@When("click on the FirstCheckBox of created EmpId")
	public void click_on_the_first_check_box_of_created_emp_id() {
	    getPIM_HomePage.checkBox();
	}

	@When("click on the EditIcon")
	public void click_on_the_edit_icon() {
		getPIM_HomePage.EditClick();
	}

	@When("enter MiddleName in MiddleNameField and click on save button")
	public void enter_middle_name_in_middle_name_field_and_click_on_save_button() {
		setSleepTime(2000);
	    getEmpPersonalDetail_Page.UpdateMiddleName("Gurunath");
	    getHomePage.ClickPIM();
	}

	@When("search Updated EmpId in EmpId Field")
	public void search_updated_emp_id_in_emp_id_field() {
	   getPIM_HomePage.SearchEmpId("2640");
	   getPIM_HomePage.SearchButton();
	}

	@Then("verify MiddleName is Updated")
	public void verify_middle_name_is_updated() {
		setSleepTime(2000);
	    String ActMidName = getPIM_HomePage.UpdatedMiddleNameText();
	    String ExpMidName = "Rohit Gurunath";
	    Assert.assertEquals(ActMidName, ExpMidName);
	    
	}

	@When("user search created EmpId In EmpId Field")
	public void user_search_created_emp_id_in_emp_id_field() {
	    getPIM_HomePage.SearchEmpId("2640");
	    setSleepTime(1000);
	    getPIM_HomePage.SearchButton();
	}

	@When("click on the firstcheckBox")
	public void click_on_the_firstcheck_box() {
	    getPIM_HomePage.getFirstEmpCheckBox();
	}

	@When("click on the Delete and click on yes button on Delete Popup")
	public void click_on_the_delete_and_click_on_yes_button_on_delete_popup() {
	    getPIM_HomePage.DeleteCreateEmp();
	}

	@When("search EmpId In EmpId Field")
	public void search_emp_id_in_emp_id_field() {
	    getPIM_HomePage.SearchEmpId("2640");
	    getPIM_HomePage.SearchButton();
	}

	@Then("user should not be able to search delete EmpId")
	public void user_should_not_be_able_to_search_delete_emp_id() {
	    String ActMsg = getPIM_HomePage.getSearchResultMsg();
	    String ExpMsg = "No Records Found";
	    Assert.assertEquals(ActMsg, ExpMsg);
	}
}
