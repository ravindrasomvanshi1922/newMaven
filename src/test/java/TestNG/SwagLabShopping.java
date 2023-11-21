package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class SwagLabShopping {

	SeleniumUtility util = new SeleniumUtility();
	WebDriver driver = util.setUp("Chrome", "https://www.saucedemo.com/");

	@Test(priority = 1)
	public void Login() {
		util.typeInput(driver.findElement(By.id("user-name")), "standard_user");
		util.typeInput(driver.findElement(By.id("password")), "secret_sauce");

		util.clickOnElement(driver.findElement(By.id("login-button")));
	}

	@Test(priority = 2)
	public void SelectProduct() {

		util.clickOnElement(driver.findElement(By.cssSelector(".inventory_container>div>div>*:nth-child(2)>*:first-child>a>div")));

		String ExpURL = "https://www.saucedemo.com/inventory-item.html?id=4";
		String ActuslURL = driver.getCurrentUrl();
		Assert.assertEquals(ActuslURL, ExpURL);
	}

	@Test(priority = 3)
	public void AddProduct() {

		util.clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));

		WebElement RemoveButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
		System.out.println("Is RemoVe button visible and Product add into the cart: " + RemoveButton.isDisplayed());

		util.clickOnElement(driver.findElement(By.cssSelector("#shopping_cart_container>a")));

		String ExpCartURL = "https://www.saucedemo.com/cart.html";
		String ActualCartURL = driver.getCurrentUrl();
		System.out.println("Is Cart Section Is Open: " + ActualCartURL.equals(ExpCartURL));

		WebElement CartItem = driver.findElement(By.cssSelector(".cart_list>.cart_item"));
		System.out.println("Is Our Cart Item Is Display in Cart List: " + CartItem.isDisplayed());
	}

	@Test(priority = 4)
	public void CheckOutPage() {

		util.clickOnElement(driver.findElement(By.id("checkout")));

		String ExpCheckoutURL = "https://www.saucedemo.com/checkout-step-one.html";
		String ActualCheckoutURL = driver.getCurrentUrl();
		System.out.println("Is CheckOut Page Is Open: " + ActualCheckoutURL.equals(ExpCheckoutURL));
	}

	@Test(priority = 5)
	public void CheckOutOverviewPage() {

		util.typeInput(driver.findElement(By.id("first-name")), "Apurva");
		util.typeInput(driver.findElement(By.id("last-name")), "Somvanshi");
		util.typeInput(driver.findElement(By.id("postal-code")), "424104");
		util.clickOnElement(driver.findElement(By.id("continue")));

		String ExpCheckOutOverviewURL = "https://www.saucedemo.com/checkout-step-two.html";
		String ActualCheckOutOverviewURL = driver.getCurrentUrl();
		System.out.println("Is CheCkOut Overview Page Is Open: " + ActualCheckOutOverviewURL.equals(ExpCheckOutOverviewURL));

		util.clickOnElement(driver.findElement(By.id("finish")));
	}

	@Test(priority = 6)
	public void BackToProducts() {
		util.clickOnElement(driver.findElement(By.id("back-to-products")));

		String ExpBackHomePageURL = "https://www.saucedemo.com/inventory.html";
		String ActualBackHomePageURL = driver.getCurrentUrl();
		System.out.println("Is CheCkOut Overview Page Is Open: " + ActualBackHomePageURL.equals(ExpBackHomePageURL));

	}

	@Test(priority = 7)
	public void Logout() {
		util.clickOnElement(driver.findElement(By.id("react-burger-menu-btn")));
		util.clickOnElement(driver.findElement(By.id("logout_sidebar_link")));

		String ExpLoginPageURl = "https://www.saucedemo.com/";
		String ActualLoginPageURL = driver.getCurrentUrl();
		System.out.println("Is CheCkOut Overview Page Is Open: " + ActualLoginPageURL.equals(ExpLoginPageURl));
		driver.close();
	}

	
	

}
