package com.neotechlesson12;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HW2 extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		
		//login
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button")));
		
		
		
		
		tearDown();
		
		
		
		
		
	}

}
