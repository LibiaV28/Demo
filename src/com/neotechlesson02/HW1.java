package com.neotechlesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	
	/*
	 * Open Chrome browser 
	 * Go to "https://demo.guru99.com/test/newtours/"
	 * Click o Register Link
	 * Fill out ALL required info 
	 * Click submit 
	 * User successfully registered
	 * (Create the script using different locators)
	 */

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/");
		 
		 Thread.sleep(5000);
		 
		 //click o Register Link
		 driver.findElement(By.linkText("REGISTER")).click();
		 
		 Thread.sleep(5000);
		 
		 //Fill out ALL required info 
		 driver.findElement(By.name("firstName")).sendKeys("Mary");
		 driver.findElement(By.name("lastName")).sendKeys("Doe");
		 driver.findElement(By.name("phone")).sendKeys("1234567890");
		 driver.findElement(By.id("userName")).sendKeys("mdoe123@gmail.com");
		 
		 //Fill out address
		 driver.findElement(By.name("address1")).sendKeys("15 Main St.");
		 driver.findElement(By.name("city")).sendKeys("Wayne");
		 driver.findElement(By.name("state")).sendKeys("NJ");
		 driver.findElement(By.name("postalCode")).sendKeys("07603");
		 
		 //Fill out username
		 driver.findElement(By.id("email")).sendKeys("mary.doe");
		 driver.findElement(By.name("password")).sendKeys("test123");
		 driver.findElement(By.name("confirmPassword")).sendKeys("test123");
		 driver.findElement(By.name("submit")).click();
		 
		 Thread.sleep(2000);
			
			String expectedUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";
			String actualUrl = driver.getCurrentUrl();
			
			if (expectedUrl.equals(actualUrl))
			{
				System.out.println("The registration was successful!");
			}
			else
			{
				System.out.println("The registeration failed!!");
			}
			
			
			//quitting the browser
			driver.quit();

		 
	}

}
