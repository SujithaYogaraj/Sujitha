package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytra {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement txtMob = driver.findElement(By.xpath("//input[@type='tel']"));
		txtMob.sendKeys("9629561811");
		
		WebElement btnSubmit = driver.findElement(By.className("submitBottomOption"));
		btnSubmit.click();
}
		
}
