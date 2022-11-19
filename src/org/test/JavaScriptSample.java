package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSample {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			
	    driver.get("https://www.facebook.com/");
	    WebElement txtUserName = driver.findElement(By.id("email"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].setAttribute('value','Suji')",txtUserName);
	    Object ob= js.executeScript("return arguments[0].getAttribute('value')",txtUserName);
	    String st=(String)ob;
	    System.out.println(st);
	}
	
	}
