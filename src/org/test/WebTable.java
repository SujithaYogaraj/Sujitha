package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaraj\\eclipse-workspace\\IntroSelenium\\driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.icc-cricket.com/world-test-championship/standings");
			Thread.sleep(3000);
			//Locate the WebTable
			WebElement table = driver.findElement(By.xpath("//table[@class='standings-wtc--table']"));
			//From the WebTable locate the heading
			WebElement heading = table.findElement(By.xpath("//tr[@class='standings-wtc__table-head']"));
			//From the heading locate the heading elements
			List<WebElement> headingElements = driver.findElements(By.tagName("th"));
			//Iterate the list
			for(int i=0; i<headingElements.size(); i++) {
				//Individual Heading
				WebElement individualheading=headingElements.get(i);
				System.out.println(individualheading.getText());
				//From the table locate the multiple rows
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				//Iterate the rows-individual row
				for(int k=0; k<rows.size(); k++) {
					WebElement row = rows.get(k);
					//From the row locate the multiple Elements
					List<WebElement> coloumns = row.findElements(By.tagName("td"));
					for(int j=0; j<coloumns.size(); j++) {
						WebElement coloumn = coloumns.get(j);
						System.out.println(coloumn.getText());
					}
				}
			}

	}		
	}