package com.neotechlesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class HW1 extends CommonMethods {
	
	/*
	 Homework 1 
	 Open Chrome Browser
	 Go to https://demo.guru99.com/test/drag_drop.html
	 Drag the following blocks in different ways 
	 Drag BANK to DEBIT SIDE
	 Drag SALES to DEBIT SIDE
	 Drag 50000 to DEBIT SIDE
	 Drag 50000 to CREDIT SIDE 
	 Close the Browser 
	 */

	public static void main(String[] args) {
		
		setUp();
		
		//Locate Bank to be dragged
		WebElement from1 = driver.findElement(By.id("credit2"));
		
		//Locate Debit side to place Bank
		WebElement to1 = driver.findElement(By.id("bank"));
		
		//Locate Sale side to be dragged
		WebElement from2 = driver.findElement(By.id("credit1"));
		
		//Locate credit side to place Sales 
		WebElement to2 = driver.findElement(By.id("loan"));
		
		//Locate 500
		WebElement from3 = driver.findElement(By.id("fourth"));
		
		//Locate Debit side to place 5000
		WebElement to3 = driver.findElement(By.id("atm7"));
		
		//Locate credit side to place to 5000
		WebElement to4 = driver.findElement(By.id("atm8"));
		
		//To do the actions, we should create Action object 
		Actions action = new Actions(driver);
		
		
		action.dragAndDrop(from1, to1).perform();
		wait(2);
		action.dragAndDrop(from1, to2).perform();
		wait(2);
		action.dragAndDrop(from3, to3).perform();
		wait(2);
		//action.dragAndDrop(from3, to4).perform();
		action.clickAndHold(from3).moveToElement(to4).release().perform();
		wait(2);
		
		//Verify that Perfect! is displayed
		if (driver.findElement(By.linkText("Perfect!")).isDisplayed()) 
		{
			System.out.println("Test Passed! --> Perfect! is displayed");
		} 
		else 
		{
			System.out.println("Test Failed! --> Perfect! is NOT displayed");
		}
		
		tearDown();
		
		
		
		
	}

}
