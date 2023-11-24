package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import vTiger_WebPages.AddingNewPage;
import vTiger_WebPages.ContactPage;
import vTiger_WebPages.DashBoardPage;
import vTiger_WebPages.LoginPage;
import vTiger_WebPages.MassEditingPage;

public class vTiger extends SeleniumUtility{
	WebDriver driver;
	LoginPage getLoginPage;
	DashBoardPage getDashBoardPage;
	ContactPage getContactPage;
	AddingNewPage getAddingNewPage;
	MassEditingPage getMassEditingPage;
	
	@Given("user is already logged in")
	public void user_is_already_logged_in() {
	    driver = setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	    
	    getLoginPage = new LoginPage(driver);
	    getDashBoardPage = new DashBoardPage(driver);
	    getContactPage = new ContactPage(driver);
	    getAddingNewPage = new AddingNewPage(driver);
	    getMassEditingPage = new MassEditingPage(driver);
	    
	    getLoginPage.UserName("admin");
	    getLoginPage.Password("admin");
	    getLoginPage.SignInBtn();
	}

	@Given("click on AppNavigation Btn")
	public void click_on_app_navigation_btn() {
	    getDashBoardPage.AppNavigator();
	}

	@Given("go on marketing select Contacts")
	public void go_on_marketing_select_Contacts() {
	    getDashBoardPage.Marketing();
	    getDashBoardPage.Contact();
	}

	@When("user click on AddContact Btn")
	public void user_click_on_add_contact_btn() {
	   getContactPage.AddContact();
	}

	@When("select required prefix")
	public void select_required_prefix() {
	   getAddingNewPage.NoneSelect();
	}

	@When("enter FirstName and LastName")
	public void enter_first_name_and_last_name() {
		getAddingNewPage.FirstName("Rohit");
		getAddingNewPage.LastName("Sharma");
	}

	@When("click on contactPage SaveBtn")
	public void click_on_contact_page_save_btn() {
	    getAddingNewPage.SaveBtn();
	}

	@When("click on contactLink")
	public void click_on_contact_link() {
	    getContactPage.ContactLink();
	}

	@Then("user is able to search Create Contact")
	public void user_is_able_to_search_create_contact() {
	    getContactPage.FirstName("Rohit");
	    getContactPage.SearchBtn();
	    
	    String ActResult = getContactPage.SearchResultMsg();
	    String ExpResult = "Rohit";
	    Assert.assertEquals(ActResult, ExpResult);
	}

	@Then("close browser")
	public void close_browser() {
	    getDashBoardPage.ProfilLink();
	    getDashBoardPage.SignOutBtn();
	}

	@When("user search FirstName from FirstName Field")
	public void user_search_first_name_from_first_name_field() {
		getContactPage.FirstName("Rohit");
	}

	@When("click on the Search Btn")
	public void click_on_the_search_btn() {
	    getContactPage.SearchBtn();
	}

	@When("Select searched Contact")
	public void select_searched_contact() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on the Edit Icon")
	public void click_on_the_edit_icon() {
	    getContactPage.EditBtn();
	}

	@When("enter Title")
	public void enter_title() {
	    getMassEditingPage.Title("Hitman");
	}

	@When("click on MassEditingPage SaveBtn")
	public void click_on_mass_editing_page_save_btn() {
	    getMassEditingPage.SaveBtn();
	}

	@Then("user shlould be able to verify updated contact")
	public void user_shlould_be_able_to_verify_updated_contact() {
		getContactPage.FirstName("Rohit");
	    getContactPage.SearchBtn();
	    
	    String ActTitle = getContactPage.UpdatedTitleText();
	    String ExpTitle = "Hitman";
	    Assert.assertEquals(ActTitle, ExpTitle);
	}
	
	@When("user search FirstName")
	public void user_search_first_name_() {
		getContactPage.FirstName("Rohit");
	}

	@When("click the Search Btn")
	public void click_the_search_btn() {
	    getContactPage.SearchBtn();
	}
	
	@When("select contact and click on Delete")
	public void select_contact_and_click_on_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Delete Confirmation Yes Btn")
	public void click_on_delete_confirmation_yes_btn() {
	   getContactPage.DeleteYesBtn();
	}

	@Then("user should be able to verify Delete Contact")
	public void user_should_be_able_to_verify_delete_contact() {
		getContactPage.FirstName("Rohit");
	    getContactPage.SearchBtn();
	    
	    String ActMsg = getContactPage.NoContactMsg();
	    String ExpMsg = "\r\n"
	    		+ "																No Contacts found.\r\n"
	    		+ "																	";
	    
	}

}
