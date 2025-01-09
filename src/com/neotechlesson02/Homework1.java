package com.neotechlesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	/*
 	HW1: Amazon Page Title Verification: 
	Open chrome browser
	Go to “https://www.amazon.com/”
	Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
	End the Session (close the browser).
 
 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//all I have to test has to go inside these code 
		
		driver.get("https://www.amazon.com/");
	
		
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, "
				+ "Computers, Books, DVDs & more";
		
		String actualTitle = driver.getTitle();
		
		System.out.println("Actual Title: " + actualTitle);
		
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Test Passed!");
		}
		else 
		{
			System.out.println("Test Failed!");
		}
		
		//this is a java method (not coming from selenium)
		//we use it to stop the code so that we can visually inspect the result/test
		
		Thread.sleep(50000);
		
		driver.quit();
	}

}
