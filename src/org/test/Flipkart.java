package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	
		txtUserName.sendKeys("Greens Tech OMR");
	
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		
		txtPassword.sendKeys("Hello123");
		
		WebElement btnLogin2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnLogin2.click();
}
}
