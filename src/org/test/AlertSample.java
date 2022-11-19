package org.test;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			
		//Simple ALert 
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement btnSignin = driver.findElement(By.name("proceed"));
		btnSignin.click();
		Alert al=driver.switchTo().alert();	
	    al.accept();

	    //Confirm Alert
	    driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement btnConfirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		btnConfirm.click();
		WebElement btnClick2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnClick2.click();
		Alert al2=driver.switchTo().alert();
		al2.dismiss();
		
		//Prompt Alert
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement btnPrompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btnPrompt.click();
		WebElement btnClick3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnClick3.click();
		Alert al3=driver.switchTo().alert();
		al3.sendKeys("Hello");
		al3.accept();
		
}
}
