package com.neotechlesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	/* Homework 1:
        FrameDemo at com.neotech.lesson07 using
         the CommonMethods.java
    */
	public static void main(String[] args) {
		 
		setUp();
		
		//1. switch to frame using index
		switchToFrame(0);
		
		WebElement age = driver.findElement(By.id("age"));
		sendText(age, "30");
		
		wait(3);
		
		driver.switchTo().defaultContent();
		
		//2. switch to frame using WebElement 
		switchToFrame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		sendText(age, "35");
		
		wait(3);
		
		
		tearDown();
		
	}

}
