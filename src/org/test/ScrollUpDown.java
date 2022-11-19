package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			
	    driver.get("http://www.greenstechnologys.com/");
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement scrollDown = driver.findElement(By.xpath("(//span[@class='blue_text'])[1]"));
	    js.executeScript("arguments[0].scrollIntoView(true);",scrollDown);
	    
	    Thread.sleep(3000);
	    
	    WebElement scrollUp = driver.findElement(By.xpath("//a[text()='COURSES']"));
	    js.executeScript("arguments[0].scrollIntoView(false);",scrollUp);
	}
	    
	    
}
