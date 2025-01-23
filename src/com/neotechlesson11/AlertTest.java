package com.neotechlesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class AlertTest extends CommonMethods {
	
 //https://neotech.vercel.app/delete-customer
	
	public static void main(String[] args) {
		setUp();
		
		driver.findElement(By.id("customerId")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		wait(2);
		
		System.out.println("Alert text --> " + getAlertText());
		
		wait(2);
		
		dismissAlert();
		
		
		tearDown();
	}

}
