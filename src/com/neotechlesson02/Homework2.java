package com.neotechlesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	
	/*
	 
	HW2: Opening Page on Firefox Browser
	Open Firefox browser
	Navigate to “https://www.redfin.com/”
	Verify that you have navigated to (https://www.redfin.com/)
	End the Session (close the browser).
	 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redfin.com/");
		
		Thread.sleep(5000);
		
		String expectedUrl = "https://www.redfin.com/";
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equals(expectedUrl))
		{
			System.out.println("Test Passed!");
		}
		else 
		{
			System.out.println("Test Failed!");
		}
		
		driver.quit();
	}

}
