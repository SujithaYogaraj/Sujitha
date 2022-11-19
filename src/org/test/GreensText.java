package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement txtHome = driver.findElement(By.xpath("//span[text()='Overview']"));
		String text = txtHome.getText();
		txtHome.click();
		Thread.sleep(5000);
		
		WebElement ove= driver.findElement(By.xpath("//p[contains(text(),'best')][1]"));
		
		String text2 = ove.getText();
		
		System.out.println(text2);
		
		WebElement txtTrainer = driver.findElement(By.xpath("//span[@class='fas fa-bookmark']"));
		String text1 = txtTrainer.getText();
		txtTrainer.click();
		Thread.sleep(3000);
		
		WebElement txtVelmurugan = driver.findElement(By.xpath("//p[contains(text(),'flexible')]"));
		String text3 = txtVelmurugan.getText();
		System.out.println(text3);
		
}
}
