package com.neotechlesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 	Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		
		Fill out just
		First Name:	
		Last Name:	
		Phone:	
		Email:	
		And Click Submit 

		 */
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	
	Thread.sleep(1000);
	
	//find an element with an anchor tag <a... that has the text REGISTER
	driver.findElement(By.linkText("REGISTER")).click();
	
	//we could use partial link text locator 
	//driver.findElement(By.partialLinkText("REGIST")).click()
	
	
	Thread.sleep(3000);
	
	
	//now that we go to the register page, lets send the other info
	
	driver.findElement(By.name("firstName")).sendKeys("Test");
	driver.findElement(By.name("lastName")).sendKeys("Test");
	driver.findElement(By.name("phone")).sendKeys("1234567");
	driver.findElement(By.id("userName")).sendKeys("neo@gmail.com");
	
	Thread.sleep(3000);//so that we can see 
	
	driver.findElement(By.name("submit")).click();
	
	Thread.sleep(3000);
	
	driver.quit();
	

		
		
		
		
		
		driver.quit();
	}

}
