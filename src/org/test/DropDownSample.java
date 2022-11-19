package org.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSample {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			
	    driver.get("https://www.facebook.com/");
	    
	    WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    btnCreate.click();
	    
	    Thread.sleep(3000);
	    
//	    WebElement droDay = driver.findElement(By.id("day"));
//	    Select select= new Select(droDay);
//	    select.selectByValue("7");
//	    
	    WebElement dropMonth = driver.findElement(By.xpath("//select[@id='month']")); 
	    Select se= new Select(dropMonth);
//	    se.selectByVisibleText("Jun");
	    
//	    WebElement dropYear = driver.findElement(By.xpath("//select[@id='year']"));
//	    Select sel = new Select(dropYear);
//	    sel.selectByIndex(25);
	    
	    List<WebElement> options = se.getOptions();
	    int size = options.size();
	    System.out.println(size);
	    
	    for(int i=0; i<options.size(); i++) {
	    	
	    	WebElement ele = options.get(i);
	    	String text = ele.getText();
	    	System.out.println("Text Value:"+text);
	    	
	    	
	    	String attribute = ele.getAttribute("value");
	    	System.out.println("Attribute value:"+attribute);
	    }
	    }	    
}

