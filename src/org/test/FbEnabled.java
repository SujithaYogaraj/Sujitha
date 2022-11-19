package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbEnabled {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='email']"));
	
	    boolean enabled=txtUserName.isEnabled();
	    
	    if(enabled==true) {
	    	
	    	txtUserName.sendKeys("WelcomeJava");
	    }
	    
	    else {
	    	
	    	System.out.println("Text user name is not enabled");
	    }
	    }
}
