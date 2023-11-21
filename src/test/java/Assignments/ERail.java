package Assignments;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ERail {

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("Chrome", "https://erail.in/");

// Main Window ---> 
		
		String HomePageWindId = driver.getWindowHandle();
		System.out.println("HomePageId: "+HomePageWindId);
		
		 util.clickOnElement(driver.findElement(By.cssSelector("#divMainWrapper>*:first-child>*:nth-child(5)>*:nth-child(4)")));
		  
		 Set<String> AllWindowPageId = driver.getWindowHandles();
		 System.out.println("AllWindowPageId: "+AllWindowPageId);
		  
		 AllWindowPageId.remove(HomePageWindId);
		 System.out.println("Remaining ChildPageId: "+AllWindowPageId);
		 
		 driver.switchTo().window(AllWindowPageId.iterator().next());
		 
// search trains --> 
		 
		 util.clickOnElement(driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")));
		 util.typeInput(driver.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")), "12627");
		 util.setSleepTime(2000);
		 driver.navigate().refresh();
		 util.clickOnElement(driver.findElement(By.xpath("//div[@class='w-full']/button")));
		 
// Select Date --- > 
		 
		 util.clickOnElement(driver.findElement(By.className("custom-date-picker")));
		 for(int i = 0; i < 6; i++) {
			driver.findElement(By.className("custom-date-picker")).sendKeys(Keys.ARROW_DOWN); 
		 }
		 driver.findElement(By.className("custom-date-picker")).sendKeys(Keys.ENTER); 
		
		 util.setSleepTime(5000);
		 util.clickOnElement(driver.findElement(By.xpath("//select[@placeholder=\"Boarding Station\"]")));
		
// Select Boarding Station --->
		 
		List<WebElement> BoardingStation = driver.findElements(By.xpath("//select[@placeholder=\"Boarding Station\"]/option"));
		System.out.println("BoardingStations: "+BoardingStation.size());
		for (int i = 0; i < BoardingStation.size(); i++) {
			if (BoardingStation.get(i).getText().contains("ITARSI JN")) {
				util.clickOnElement(BoardingStation.get(i));
				break;
			}	
		}
		
		util.clickOnElement(driver.findElement(By.xpath("//div[@class=\"p-4\"]/button")));
		
// Restaurant List -->
		
		System.out.println("Available Restaurants");
		List<WebElement> RestoList = driver.findElements(By.xpath("//div[@id=\"page-container\"]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[1]/h5"));
		for(int i = 0; i<RestoList.size(); i++) {
			String Restaurants = RestoList.get(i).getText();
			System.out.println(Restaurants);
		}
		driver.switchTo().window(HomePageWindId);
		
// Select From  station ---> 
		
		WebElement FromInput = driver.findElement(By.id("txtStationFrom"));
		util.clickOnElement(FromInput);
		FromInput.clear();
		util.typeInput(FromInput, "Pune");
		
// Select To Station ---> 
		
		WebElement ToInput = driver.findElement(By.id("txtStationTo"));
		util.clickOnElement(ToInput);
		ToInput.clear();
		util.typeInput(ToInput, "Bengaluru");

// Select Date --> 
		
		util.clickOnElement(driver.findElement(By.id("tdDateFromTo")));
		util.clickOnElement(driver.findElement(By.xpath("//div[@id=\"divCalender\"]/center/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[7]")));
		util.clickOnElement(driver.findElement(By.id("tdTrainFromTo")));
		
// Trains List ---> 
		
		System.out.println("Available Trains");
		List<WebElement> Trains = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr"));
		for(int i = 0; i<Trains.size(); i++) {
			String Train = Trains.get(i).getText();
			System.out.println(Train);
		}
		
	}

}
