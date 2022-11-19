package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbRobot {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.facebook.com");
		
		WebElement txtSearch = driver.findElement(By.id("email"));
		txtSearch.sendKeys("sujithasuji.sm@gmail.com");
		
		
		WebElement rightEmail = driver.findElement(By.xpath("//body[@dir='ltr']"));
		Actions ac=new Actions(driver);
		ac.contextClick(rightEmail).perform();
		
		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_A);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_A);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement txtrightPaste = driver.findElement(By.id("pass"));
		Actions ac2=new Actions(driver);
		ac2.contextClick(txtrightPaste).perform();

		for(int i=0;i<9;i++) {
		rb.keyPress(KeyEvent.VK_DOWN);
		}
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
			
}
}
