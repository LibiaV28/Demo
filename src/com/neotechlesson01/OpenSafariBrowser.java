package com.neotechlesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenSafariBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Open the browser
			WebDriver driver = new SafariDriver();
			
		//2. Go to the URL
			driver.get("https://www.neotechacademy.com/");
			
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.neotechacademy.com/";
			
			if (actualURL.equals(expectedURL))
			{
				System.out.println("Page Title: " + driver.getTitle());
			}
			else 
			{
				System.out.println("The URL is wrong!");
			}
			
		
		//3. Do the require test/actions 
		//We will pause the web-page for a few seconds to properly see it 
		Thread.sleep(5000);	//Pause the execution for five second
		
		//4. Close browser
		driver.quit();
	}

}
