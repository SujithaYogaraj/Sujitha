package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	WebElement txtFirstName = driver.findElement(By.name("firstName"));
	txtFirstName.sendKeys("Sujitha");
	
	WebElement txtLastName = driver.findElement(By.name("lastName"));
	txtLastName.sendKeys("Murali");
	
	WebElement txtUserName = driver.findElement(By.name("Username"));
	txtUserName.sendKeys("sujithamurali");
	
	WebElement txtPassword = driver.findElement(By.name("Passwd"));
	txtPassword.sendKeys("Suji23");
	
	WebElement txtCPassword = driver.findElement(By.name("ConfirmPasswd"));
	txtCPassword.sendKeys("Suji23");
	
	WebElement btnShow = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
	btnShow.click();
	
	WebElement btnNext = driver.findElement(By.className("VfPpkd-vQzf8d"));
	btnNext.click();
}
}
	
	
	
	
	