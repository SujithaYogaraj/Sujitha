package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/trains");
	
 WebElement txtFrom = driver.findElement(By.id("from_station"));

	txtFrom.sendKeys("Tanjore");
	
	WebElement txtTo = driver.findElement(By.id("to_station"));
	
	txtTo.sendKeys("Chennai");
}
}
