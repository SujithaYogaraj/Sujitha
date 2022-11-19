package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\yogaraj\\\\eclipse-workspace\\\\IntroSelenium\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.google.com");
	
	WebElement txtQ = driver.findElement(By.name("q"));
	
	txtQ.sendKeys("Greens Technology");
	
	driver.quit();
	}
}
