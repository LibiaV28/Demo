package com.neotechlesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

	/*
	 Facebook dropdown verification
     Open chrome browser
     Go to https://www.facebook.com/r.php

     Verify:

     month dd has 12 month options
     day dd has 31 day options
     year dd has 118 year options

     Select your date of birth	

     Quit browser
     */
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//verify month
		Select month = new Select(driver.findElement(By.id("month")));
		System.out.println("Number of items in month dropdown is: " + month.getOptions().size());
		
		//verify days 
		Select day = new Select(driver.findElement(By.id("day")));
		System.out.println("Number of items in day dropdown is: " + day.getOptions().size());

		//verify years 
		Select year = new Select(driver.findElement(By.id("year")));
		System.out.println("Number of items in year dropdown is: " + year.getOptions().size());

		Thread.sleep(3000);


		//add your DOB
		day.selectByIndex(27);
		Thread.sleep(3000);

		month.selectByValue("5");
		Thread.sleep(3000);

		year.selectByVisibleText("1991");
		Thread.sleep(3000);

		tearDown();
		
	}

}
