package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/");
		WebElement btnEnroll =driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		btnEnroll.click();
		WebElement txtFirstName =driver.findElement(By.id("first-name"));
		txtFirstName.sendKeys("Sujitha");
		WebElement txtLastName =driver.findElement(By.id("last-name"));
		txtLastName.sendKeys("Murali");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("SujithaMurali@gmail.com");
		WebElement txtMob = driver.findElement(By.id("mobile"));
		txtMob.sendKeys("9874563210");
		WebElement txtCity = driver.findElement(By.id("city"));
		
		txtCity.sendKeys("Chennai");
		
		WebElement txtMessage = driver.findElement(By.name("message"));
		
		txtMessage.sendKeys("No Comments");
		
		 WebElement txtCode = driver.findElement(By.id("code"));
			
		txtCode.sendKeys("5bT1");
		
        WebElement btnSend =driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
		
		btnEnroll.click();
		
}		
}
