package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class vTiger_Creation {
	SeleniumUtility util = new SeleniumUtility();
	WebDriver driver = util.setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");

	@Test(priority = 1)
	public void Login() {
		util.clickOnElement(driver.findElement(By.id("username")));
		util.typeInput(driver.findElement(By.id("username")), "admin");
		
		util.clickOnElement(driver.findElement(By.id("password")));
		util.typeInput(driver.findElement(By.id("password")), "admin");
		
		util.clickOnElement(driver.findElement(By.className("button")));

	}

	@Test(priority = 2)
	public void appNavigator() {

		util.clickOnElement(driver.findElement(By.className("app-icon")));
		util.clickOnElement(driver.findElement(By.xpath("//span[text()=' MARKETING']")));
		util.clickOnElement(driver.findElement(By.xpath("//div[@id=\"mCSB_1_container\"]/li[3]/a")));
		util.clickOnElement(driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")));

	}

	@Test(priority = 3)
	public void CreateContact() {

		WebElement Gen = driver.findElement(By.id("select2-chosen-2"));
		util.clickOnElement(Gen);
		List<WebElement> Drp = driver.findElements(By.xpath("//div[@id='select2-drop']/ul/li"));
		for (int i = 0; i < Drp.size(); i++) {
			if (Drp.get(i).getText().contains("Mrs.")) {
				util.clickOnElement(Drp.get(i));
				break;
			}
		}

		util.clickOnElement(driver.findElement(By.id("Contacts_editView_fieldName_firstname")));
		util.typeInput(driver.findElement(By.id("Contacts_editView_fieldName_firstname")), "Apurva");

		util.clickOnElement(driver.findElement(By.id("Contacts_editView_fieldName_lastname")));
		util.typeInput(driver.findElement(By.id("Contacts_editView_fieldName_lastname")), "Somvanshi");

		util.clickOnElement(driver.findElement(By.className("saveButton")));
		util.setSleepTime(2000);
		util.clickOnElement(driver.findElement(By.xpath("//a[@title='Contacts']/h4")));

	}

	@Test(priority = 4)
	public void ContactEdit() {

		util.clickOnElement(driver.findElement(By.className("listViewEntriesCheckBox")));
		util.clickOnElement(driver.findElement(By.id("Contacts_listView_massAction_LBL_EDIT")));
		//util.clickOnElement(driver.findElement(By.id("Contacts_editView_fieldName_mobile")));
		util.typeInput(driver.findElement(By.id("Contacts_editView_fieldName_title")), "Fresher");
		util.clickOnElement(driver.findElement(By.className("saveButton")));
		//util.clickOnElement(driver.findElement(By.xpath("//div[@class='notificationHeader']/button")));
		//util.setSleepTime(2000);
		driver.navigate().refresh();
		driver.switchTo().alert().accept();
		util.setSleepTime(3000);

	}

	@Test(priority = 5)
	public void Delete() {
		util.clickOnElement(driver.findElement(By.className("listViewEntriesCheckBox")));
		util.clickOnElement(driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")));
		util.clickOnElement(driver.findElement(By.xpath("//button[@data-bb-handler='confirm']")));
		util.setSleepTime(3000);
		driver.navigate().refresh();
	}

	@Test(priority = 6)
	public void Close() {
		util.clickOnElement(driver.findElement(By.className("fa-user")));
		util.clickOnElement(driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")));
		driver.close();

	}

}
