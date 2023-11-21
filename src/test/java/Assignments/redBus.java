package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class redBus {
	public static void main(String[] args) {

		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("Chrome", "https://www.redbus.in/");

		WebElement FromInputField = driver.findElement(By.id("src"));
		util.typeInput(FromInputField, "Pune");

		List<WebElement> FromList = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]/li[2]/div/text"));

		for (int i = 0; i < FromList.size(); i++) {
			if (FromList.get(i).getText().contains("Swargate")) {
				util.clickOnElement(FromList.get(i));
			}
			break;
		}

		WebElement toInputField = driver.findElement(By.id("dest"));
		util.typeInput(toInputField, "Goa");

		List<WebElement> toList = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]/li[2]/div/text"));

		for (int i = 0; i < toList.size(); i++) {
			if (toList.get(i).getText().contains("Panjim")) {
				util.clickOnElement(toList.get(i));
			}
			break;
		}

//DAtePicker ----> 

		util.clickOnElement(driver.findElement(By.id("Layer_1")));
		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"DatePicker__CalendarContainer-sc-1kf43k8-0 jQCNYF\"]/div/div[3]/div[5]/span/div[6]/span")));

//Search Button --->

		util.clickOnElement(driver.findElement(By.id("search_button")));

//PopUp handling ---->

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"onward-modify-btn\"]")));
		try {
			util.clickOnElement(driver.findElement(By.cssSelector(".coach-close")));
		} catch (ElementClickInterceptedException e) {

		}
//click on before 6 am bus ---->
		try {
			util.clickOnElement(
					driver.findElement(By.xpath("//input[@id=\"dtBefore 6 am\"]//following-sibling::label[1]")));
		} catch (ElementClickInterceptedException e) {

		}

//view Buses --->

		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"clearfix\"]/div/div[4]/div[2]/i")));

//Buses List ----> 

		System.out.println("Available Buses ");
		System.out.println();
		List<WebElement> buslist = driver.findElements(By.xpath("//div[@id=\"result-section\"]/div[2]/div[2]/ul/div"));
		for (int i = 0; i < buslist.size(); i++) {
			String buses = buslist.get(i).getText();
			System.out.println("BusName:-------> " + buses);
			System.out.println("--------------------------------------------");
		}

	}
}
