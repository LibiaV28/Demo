package com.neotechlesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	/* 
	    //1. Open chrome browser
		//2. Navigate to “https://www.zillow.com/”
		//3. Navigate to “https://www.google.com/”
		//4. Navigate back to Zillow Page
		//5. Refresh current page
		//6. Verify url contains “Zillow”

	 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//1st way to go to a url: .get()
		//driver.get("https://www.zillow.com/"); // does not maintain history 
		
		//2nd way to go to a url: .navigate().to()
		driver.navigate().to("https://www.zillow.com/");//it will maintain history
		//to use back and forward commands
		
		Thread.sleep(4000);
		
		//maximize screen 
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(4000);
		
		driver.navigate().back(); // get back to the previous page
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		
		String url = "https://www.zillow.com/";
		String actualUrl = driver.getCurrentUrl();
		
		if (url.equals(actualUrl))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed!");
			System.out.println("Current Url: " + actualUrl);
			System.out.println("Expected Url: " + url);
		}
		
		driver.quit();
		
		
	
		
	}

}
