package com.neotechlesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*
	 	HW1: Orange HRM Application Login:
		Open Chrome browser
		Go to https://hrm.neotechacademy.com/
		Enter valid username and password
		Click on login button
		Then verify that "span with id account-name" has the text "Jacqueline White".
		Quit the browser
	 
	 */
	
	
	setUp();
	
	//Getting username and login from configuration properties 
	
	String username = ConfigsReader.getProperty("username");
	String password = ConfigsReader.getProperty("password");
	
	System.out.println(username + " " + password);
	
	//locate the web elements 
	WebElement usernameBox = driver.findElement(By.id("txtUsername"));
	WebElement passwordBox = driver.findElement(By.id("txtPassword"));
	WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
	
	
	//send credentials and login
	usernameBox.sendKeys(username);
	passwordBox.sendKeys(password);
	loginBtn.click();
	
	
	Thread.sleep(3000);
	
	
	String expected = "Jacqueline White";
	String actual = driver.findElement(By.id("account-name")).getText();
	
	if (expected.equals(actual))
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
