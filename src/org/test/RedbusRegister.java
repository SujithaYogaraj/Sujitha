package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusRegister {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	WebElement btndown = driver.findElement(By.id("i-icon-profile"));
    btndown.click();
	
	WebElement btnSignIn = driver.findElement(By.id("signInLink"));
	btnSignIn.click();

	WebElement txtMob = driver.findElement(By.id("mobileNoInp"));
	txtMob.sendKeys("98775644578");
	
	WebElement btnRobot = driver.findElement(By.xpath("//div[@role='presentation']"));
	btnRobot.click();
	
	WebElement btnOtp = driver.findElement(By.xpath("//span[@class='f-w-b']"));
	btnOtp.click();
	
}
	
}