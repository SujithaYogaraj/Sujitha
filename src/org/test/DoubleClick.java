package org.test;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\yogaraj\\\\eclipse-workspace\\\\IntroSelenium\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
driver.get("http://www.google.com");

WebElement txtSearchBox = driver.findElement(By.name("q"));
txtSearchBox.sendKeys("greens");

Actions ac=new Actions(driver);
ac.doubleClick(txtSearchBox).perform();
ac.keyDown(Keys.SHIFT).sendKeys(txtSearchBox,"greens").keyUp(Keys.SHIFT).perform();


		}
}
