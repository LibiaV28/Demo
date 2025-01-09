package com.neotechlesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HW1 extends BaseClass{
/*
  		Homework 1: Use WebDriverWait Verify element is enabled

		 Open chrome browser
		 Go to "https://neotech.vercel.app/" 
		 Click on the "Interactions" link 
		 Then click on "Waits"
		 Click on enable button 
		 Enter "Hello" and verify text is entered successfully 
		 Close the browser
		 
 
 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		driver.findElement(By.id("menu-interactions")).click();
		
	
		driver.findElement(By.id("waits")).click();
		
		
		
		Thread.sleep(4000);
		
		
		tearDown();
	}

}
