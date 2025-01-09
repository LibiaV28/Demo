package com.neotechlesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {
	
	/*
	 * Alert text verification
	 * Open Chrome browser 
	 * Go to https://neotech.vercel.app
	 * Click on "Alerts, Frame & Windows" links 
	 * Click on "Alerts" links on the left side 
	 * Click on "Show Alert" button to see Alert 
	 * Verify alert box with text "You clicked a button" is present
	 * Click on 3rd button ("Show Confirm") in the page 
	 * Verify alert box with text "Do you confirm action?" is present and click "OK"
	 * Click on 4th button ("Show prompt") in the page and enter your name and click "ok"
	 * Quit browser 
	 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//Click on "Alerts, Frame & Windows" links 
		driver.findElement(By.id("menu-alerts")).click();
		Thread.sleep(2000);
		
		//Click on "Alerts" links on the left side 
		driver.findElement(By.id("alerts")).click();	
		Thread.sleep(2000);

		//Click on "show alert" button to see alert
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(2000);

	
		//At this point, an alert will pop-up
		//We should move the focus from the default content into the alert 
		Alert alert = driver.switchTo().alert();
		
		
		//Verify alert box with text "You clicked a button" is present
		System.out.println("The text of the alert --> " + alert.getText());
		
		//We need to end the alert --> we can accept it 
		alert.accept();
		Thread.sleep(2000);

		//Click on 3rd button ("Show Confirm") in the page
		driver.findElement(By.id("btnConfirm")).click();
		Thread.sleep(2000);
		
		//reassign alert 
		alert = driver.switchTo().alert();

		//Verify alert box with text "Do you confirm action?" is present and click "OK"
		System.out.println("The text of the verify alert --> " + alert.getText());
		alert.accept();
		Thread.sleep(2000);

		//Click on 4th button ("Show prompt") in the page and enter your name and click "ok"
		driver.findElement(By.id("btnPrompt")).click();
		   //reassign alert 
		alert = driver.switchTo().alert();
		alert.sendKeys("Libia");
		//using the username in configs file 
		//alert.sendKeys(ConfigsReader.getProperty("username"));
		Thread.sleep(4000);
		alert.accept();

		
		
		
		
		tearDown();
	}

}
