package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.greenstechnologys.com/");
    
	WebElement mouseHoverAction = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
	Actions ac=new Actions(driver);
	ac.moveToElement(mouseHoverAction).perform();
	
	WebElement mouse2 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
	ac.moveToElement(mouse2).perform();
	
	WebElement btnClick = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
	btnClick.click();
	
}
}
