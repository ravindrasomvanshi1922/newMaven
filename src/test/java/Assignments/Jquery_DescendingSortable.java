package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Jquery_DescendingSortable {

	public static void main(String[] args) {
		
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("Chrome", "https://jqueryui.com/");
		
		util.clickOnElement(driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[5]/a")));
		
		WebElement iFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iFrame);
		//util.setSleepTime(4000);
	    
		List<WebElement> SecElements = driver.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
		
		Actions act = new Actions(driver);

// Item 7 --> Item 1
		WebElement Target1 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[1]"));
		act.doubleClick(SecElements.get(6)).dragAndDrop(SecElements.get(6), Target1).build().perform();

// Item 6 --> Item 2
		WebElement Target2 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[2]"));
		act.doubleClick(SecElements.get(5)).dragAndDrop(SecElements.get(5), Target2).build().perform();
		
// Item 5 --> Item 3
		WebElement Target3 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[3]"));
		act.doubleClick(SecElements.get(4)).dragAndDrop(SecElements.get(4), Target3).build().perform();
		
// Item 4 --> Item 4
		WebElement Target4 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[4]"));
		act.doubleClick(SecElements.get(3)).dragAndDrop(SecElements.get(3), Target4).build().perform();
		
// Item 3 --> Item 5
		WebElement Target5 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[5]"));
		act.doubleClick(SecElements.get(2)).dragAndDrop(SecElements.get(2), Target5).build().perform();

// Item 2 --> Item 6
		WebElement Target6 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[6]"));
		act.doubleClick(SecElements.get(1)).dragAndDrop(SecElements.get(1), Target6).build().perform();

// Item 1 Will be Automatically move at 7th Position --->
		System.out.println("This List Is In Descending Order now ");
		
	}

}
