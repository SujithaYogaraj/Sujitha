package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		
		txtUserName.sendKeys("Sujitha Murali");
		
		WebElement txtPassword =driver.findElement(By.name("password"));
		
		txtPassword.sendKeys("123454");

}	
}
