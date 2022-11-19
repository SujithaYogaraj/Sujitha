package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(3000);
	WebElement dragElement = driver.findElement(By.id("credit2"));
	WebElement dropElemnent = driver.findElement(By.id("bank"));
	Actions ac=new Actions(driver);
	ac.dragAndDrop(dragElement, dropElemnent).perform();
	Thread.sleep(3000);
	
	WebElement dragAmount = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement dropAmount = driver.findElement(By.id("amt7"));
	ac.dragAndDrop(dragAmount, dropAmount).perform();
	
	WebElement dragSales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement dropSales = driver.findElement(By.id("loan"));
	ac.dragAndDrop(dragSales, dropSales).perform();
	
	WebElement dragAmount2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement dropAmount2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
	ac.dragAndDrop(dragAmount2, dropAmount2).perform();
}
}
 