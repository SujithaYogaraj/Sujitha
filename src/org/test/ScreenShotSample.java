package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSample {

	public static <TakeScreenshot> void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    
	    WebElement txtDemoPage = driver.findElement(By.id("email"));
	    txtDemoPage.sendKeys("htdg");
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File screenshotAs=ts.getScreenshotAs(OutputType.FILE);
	    System.out.println(screenshotAs);
	    
	    //File file= new File;
	    FileUtils.copyFile(screenshotAs,new File("\\C:\\java\\ss.png"));
	}
	}

	