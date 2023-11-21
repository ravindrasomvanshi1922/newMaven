package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class NewTest {
	SeleniumUtility util = new SeleniumUtility();
	WebDriver driver = util.setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	
  @Test(priority=1)
  public void f() {
	  util.clickOnElement(driver.findElement(By.className("button")));
	  util.clickOnElement(driver.findElement(By.className("app-icon")));
	  util.clickOnElement(driver.findElement(By.xpath("//span[text()=' MARKETING']")));
	  util.clickOnElement(driver.findElement(By.xpath("//div[@id='mCSB_8']/div[1]/ul[1]/li/a")));
  }
}
