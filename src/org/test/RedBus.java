package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
 WebElement txtFrom = driver.findElement(By.id("src"));

	txtFrom.sendKeys("Tanjore");
	
	WebElement txtTo = driver.findElement(By.id("dest"));
	
	txtTo.sendKeys("Chennai");
	
	//driver.quit();
	
	}
	
	
}
