package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.netty.handler.timeout.TimeoutException;
import utilities.SeleniumUtility;

public class OrangeHRM_Creation {

	SeleniumUtility util = new SeleniumUtility();
	WebDriver driver = util.setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	@Test(priority = 1)
	public void Login() {
		util.clickOnElement(driver.findElement(By.className("oxd-button")));
		util.typeInput(driver.findElement(By.name("username")), "Admin");
		util.typeInput(driver.findElement(By.name("password")), "admin123");
		util.clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	}

	@Test(priority = 2)
	public void PIMCreate() {

// Click on PIM then Add Employee  --->

		util.clickOnElement(driver.findElement(By.cssSelector("ul >*:nth-child(2) > a > span")));
		util.clickOnElement(driver.findElement(By.cssSelector("nav > ul > li:nth-child(3) > a")));

// InputField ---> 

		util.typeInput(driver.findElement(By.name("firstName")), "Durvesh");
		util.typeInput(driver.findElement(By.name("lastName")), "Somvanshi");
		driver.findElement(By.name("lastName")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']/div[2]/div/div/div[2]/input")).sendKeys(Keys.BACK_SPACE);
		util.typeInput(driver.findElement(By.xpath("//div[@class='oxd-form-row']/div[2]/div/div/div[2]/input")),"7820");
		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"oxd-form-actions\"]/button[2]")));

	}

	@Test(priority = 3)
	public void EmpIdSearch() {

// click on employee List ----> 

		util.clickOnElement(driver.findElement(By.xpath("//header[@class=\"oxd-topbar\"]/div[2]/nav/ul/li[2]/a")));
		util.clickOnElement(driver.findElement(By.cssSelector(".oxd-form-row>div>*:first-child>div>*:nth-child(2)>div>div>input")));
		util.typeInput(driver.findElement(By.cssSelector(".oxd-form-row>div>*:first-child>div>*:nth-child(2)>div>div>input")),"Durvesh");
		util.clickOnElement(driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input")));
		util.typeInput(driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input")),"7820");
		util.clickOnElement(driver.findElement(By.cssSelector(".oxd-form-actions>*:nth-child(2)")));
		util.clickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div/div/div[2]/div")));

	}

	@Test(priority = 4)
	public void PIMEdit() {

		util.setSleepTime(2000);
		WebElement DrivingLicenseNum = driver.findElement(By.xpath("//form[@class='oxd-form']/div[2]/div[2]/div[1]/div/div[2]/input"));
		util.clickOnElement(DrivingLicenseNum);
		util.typeInput(DrivingLicenseNum, "190502");
		util.clickOnElement(driver.findElement(By.xpath("//form[@class='oxd-form']/div[5]/button")));
		util.clickOnElement(driver.findElement(By.xpath("//header[@class=\"oxd-topbar\"]/div[2]/nav/ul/li[2]/a")));

	}

	@Test(priority = 5)
	public void PIMDelete() {

		util.clickOnElement(driver.findElement(By.cssSelector(".oxd-form-row>div>*:first-child>div>*:nth-child(2)>div>div>input")));
		util.typeInput(driver.findElement(By.cssSelector(".oxd-form-row>div>*:first-child>div>*:nth-child(2)>div>div>input")),"Durvesh");
		util.clickOnElement(driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input")));
		util.typeInput(driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input")),"7820");
		util.clickOnElement(driver.findElement(By.cssSelector(".oxd-form-actions>*:nth-child(2)")));
		util.clickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div/div/div[9]/div[1]/button[1]/i")));
		util.clickOnElement(driver.findElement(By.xpath("//div[@id='app']/div[3]/div/div/div/div[3]/button[2]/i")));
	}

	@Test(priority = 6)
	public void Logout() {

		util.clickOnElement(driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div[2]/ul/li/span/p")));
		util.clickOnElement(driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div[2]/ul/li/ul/li[4]/a")));
		driver.close();

	}

}
