package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealLogin {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement btnSignIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnSignIn.click();
		
		WebElement btnRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnRegister.click();
		
		WebElement txtMob = driver.findElement(By.id("userName"));
		txtMob.sendKeys("9874563210");
		
		WebElement btnContinue = driver.findElement(By.id("checkUser"));
		btnContinue.click();
		
}
}
