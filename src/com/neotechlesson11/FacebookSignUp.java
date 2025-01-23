package com.neotechlesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods {

	//https://www.facebook.com/r.php
	public static void main(String[] args) {
		
		setUp();
		
		//Be careful with the index use, with visible text we get the 
		//exact same value but with index we would end up having + 1
		//for ex: for selecting day 10 we use index 9
		selectDropdown(driver.findElement(By.id("day")), 20);
		
		wait(2);
		
		selectDropdown(driver.findElement(By.id("month")), "Jan");
		
		wait(2);
		
		selectDropdown(driver.findElement(By.id("year")), 2025);
		
		wait(2);
		
		
		
		
		tearDown();
		
		
		
	}

}
