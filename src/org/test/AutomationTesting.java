package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("Sujitha");
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Murali");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddress.sendKeys("No.10 VPG avenue,OMR Chennai");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("SujithaMurali@gmail.com");
		WebElement txtMob = driver.findElement(By.xpath("//input[@type='tel']"));
		txtMob.sendKeys("9874563210");
		WebElement btnGender = driver.findElement(By.xpath("//input[@value='FeMale']"));
		btnGender.click();
		WebElement btnHobby = driver.findElement(By.xpath("//input[@value='Movies']"));
		btnHobby.click();
		WebElement txtFirstPass = driver.findElement(By.id("firstpassword"));
		txtFirstPass.sendKeys("Suji123");
	    WebElement txtSecPass = driver.findElement(By.id("secondpassword"));
		
		txtSecPass.sendKeys("Suji123");
		
        WebElement btnSubmit = driver.findElement(By.xpath("//button[@value='sign up']"));
		
		btnSubmit.click();
		
        
		
}
}
