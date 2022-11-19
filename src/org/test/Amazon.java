package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	
	txtSearch.sendKeys("Iphone");

	WebElement btnSearch = driver.findElement(By.xpath("//input[@value='Go']"));
	
	btnSearch.click();
	
	
}
}
