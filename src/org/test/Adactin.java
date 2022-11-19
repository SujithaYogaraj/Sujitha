package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		
		txtUserName.sendKeys("Sujitha Murali");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		
		txtPassword.sendKeys("154245");
		
		driver.quit();
}
}
