package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utilities.SeleniumUtility;

public class MMT_FlightBooking {

	public static void main(String[] args) {
		
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("Chrome", "https://www.makemytrip.com/");
		util.clickOnElement(driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")));
		
// FromCity input Field---> 
		
		
	    util.clickOnElement(driver.findElement(By.id("fromCity")));
	    WebElement FromCity = driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox searchCity inactiveWidget activeWidget\"]/div/div/div/div/input"));
	    util.typeInput(FromCity, "Pune");
	    util.setSleepTime(2000);
		
	    List<WebElement> from = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		for(int i = 0; i<from.size(); i++) {
			if(from.get(i).getText().contains("Pune")) {
				util.clickOnElement(from.get(i));
				break;
			}
		}
		
// ToCity Input Field --->	
		
		util.clickOnElement(driver.findElement(By.id("toCity")));
		WebElement ToCity = driver.findElement(By.xpath("//div[@role=\"combobox\"]/input"));
		util.typeInput(ToCity, "Bengaluru");
		util.setSleepTime(2000);
		
		List<WebElement> to = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		for(int i = 0; i<to.size(); i++) {
			if(to.get(i).getText().contains("Bengaluru")) {
				util.clickOnElement(to.get(i));
				break;
			}
		}
		

// Date Selection 25 Nov 2023---->
		
		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"DayPicker\"]/div/div[2]/div[2]/div[3]/div[4]/div[7]/div/p[1]")));
		
// Travelers & Class ---> 
		
		util.clickOnElement(driver.findElement(By.xpath("//span[@class=\"lbl_input appendBottom5\"]")));
		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"appendBottom20\"]/ul/li[1]")));
		util.clickOnElement(driver.findElement(By.xpath("//button[@data-cy=\"travellerApplyBtn\"]")));
		
// Fare Type Selection ---->
		
		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"makeFlex hrtlCenter appendBottom20 flightFare\"]/div/ul/li[3]")));
		
//  Search Button --->
		
		util.clickOnElement(driver.findElement(By.xpath("//p[@data-cy=\"submit\"]/a")));
		
// Pay Later POPUP ----> 
		
		util.clickOnElement(driver.findElement(By.xpath("//span[@class=\"bgProperties icon20 overlayCrossIcon\"]")));
		
// Departure Time Before 6 am & Arrival Between 6 to 12 am--->
		
		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"filterWrapper\"]/div[5]/div/div/div[1]/span")));
	//	util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"filterWrapper\"]/div[6]/div/div/div[2]/span")));
		
// Available Flight On Our Scenario ----> 
		
		System.out.println("Available Flights");
		System.out.println("-----------------------------------------------------------------");
		List<WebElement> FlightList = driver.findElements(By.xpath("//div[@id=\"left-side--wrapper\"]/div[2]/div/div[2]/div[3]/div"));
		for(int i = 0; i<FlightList.size(); i++) {
			System.out.println(FlightList.get(i).getText());
			System.out.println("-----------------------------------------------------------------");
		}
		
		
	}

}








