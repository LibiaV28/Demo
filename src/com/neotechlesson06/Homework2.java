package com.neotechlesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		/*
	 	TC 2: Orange HRM Application Negative Login: 
		Open Chrome browser
		Go to https://hrm.neotechacademy.com/
		Enter valid username
		Leave password field empty
		Verify error message with text "Password cannot be empty" is displayed.
	 */
	
	
	setUp();
	
	//locate the username element, get the username from the props and send it.
	driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
	//the test says leave the password field empty
	//driver.findElement(By.id("txtPassword")).sendKeys("");
	
	//click on login 
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(3000);
	
	WebElement errorMsg = driver.findElement(By.id("txtPassword-error"));
	
	//this checks if the error message is displayed regardless of its text 
	if (errorMsg.isDisplayed())
	{
		System.out.println("Test Passed!");
	}
	else
	{
		System.out.println("Test Failed!");
	}
	
	tearDown();
	}

}
