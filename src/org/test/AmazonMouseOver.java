package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOver {
	public static void main(String[] args) throws InterruptedException {
		

			System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in");
			
			WebElement mouseAmazon = driver.findElement(By.xpath("//span[text()='Prime']"));
			Actions ac=new Actions(driver);
			ac.moveToElement(mouseAmazon).perform();
			
			Thread.sleep(5000);			
			WebElement btnClick = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
			btnClick.click();
		}		
}
