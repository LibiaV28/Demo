package com.neotechlesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Task1  extends CommonMethods{

	/*
	 	go to https://hrm.neotechacademy.com/
		enter username
		leave password blank
		click on login
		and take a screenshot of the error page
	 */
	public static void main(String[] args) {
		
		setUp();
		
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		
		click(driver.findElement(By.xpath("//button")));

		
		//1. Create an object of TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver; 
		
		//2. Take the photo
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		wait(4);
		
		//3. Save the photo
		try
		{
			Files.copy(source, new File("screenshots/HRM/errorpage1.png"));
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		tearDown();
	}

}
