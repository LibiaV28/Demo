package com.neotechlesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) {
		//https://hrm.neotechacademy.com/
		
		setUp();
		
		//Sending the username 
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		//Send the password
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		wait(3);
		
		//Now lets click on the log in button 
		WebElement loginBtn = driver.findElement(By.xpath("//button"));
		loginBtn.click();
		
		//Let's validate if we have logged in successfully 
		WebElement logo = driver.findElement(By.id("ohrm-small-logo"));
		
		if (logo.isDisplayed())
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		
		}
		
		wait(3);
		
		
		
		

		
		tearDown();
		
	}

}
