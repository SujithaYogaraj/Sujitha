package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsAmazon {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txtConditions = driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
		
		String text = txtConditions.getText();
		
		System.out.println(text);
}
}
