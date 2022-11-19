package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyRegister {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement btnSignin = driver.findElement(By.className("r2iyh"));
		btnSignin.click();
		
		WebElement txtMob = driver.findElement(By.id("mobile"));
		txtMob.sendKeys("9629561811");
		
		WebElement txtName = driver.findElement(By.id("name"));
		txtName.sendKeys("Sujitha");
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("sujithamail.com");
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("OMR Chennai");
		
		WebElement btnContinue = driver.findElement(By.className("a-ayg"));
		btnContinue.click();
}
}
