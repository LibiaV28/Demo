package com.neotechlesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	/*
	 * Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		Fill out ALL required info
		Click Submit
		User successfully registered
		(Create the script using different locators)
	 */

	public static final String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
		
		//Create a WebDriver object to open the browser and do the test steps
		WebDriver driver = new ChromeDriver();
		
		//Go to the url
		driver.get(url);
		
		//At this point, we should locate the desired web elements
		//driver.findElement(--locator--);
		
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		//We can make the step above in two steps
//		WebElement register = driver.findElement(By.linkText("REGISTER"));
//		register.click();
		
		//Let's fill out the form
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Doe");
		driver.findElement(By.name("phone")).sendKeys("333 333 3331");
		driver.findElement(By.id("userName")).sendKeys("jdoe@gmail.com");
		
		//Address information
		driver.findElement(By.name("address1")).sendKeys("123 Main St.");
		driver.findElement(By.name("city")).sendKeys("NYC");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("3333");
		
		//User information
		driver.findElement(By.id("email")).sendKeys("john.doe");
		driver.findElement(By.name("password")).sendKeys("Jdoe123#");
		driver.findElement(By.name("confirmPassword")).sendKeys("Jdoe123#");
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
