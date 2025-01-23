package com.neotechlesson12;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods {

	/*
	 Homework 2:
    WindowHandleDemo at com.neotech.lesson07 
    using the CommonMethods.java
	 */
	public static void main(String[] args) {
		
		
setUp();
		
		System.out.println("Title ---> " + driver.getTitle());
		System.out.println("Window Handle --> " + driver.getWindowHandle());
		
		wait(2);
		
		//this method not only clicks on the web element
		//but also has an explicit wait on it (for clickability)
		click(driver.findElement(By.linkText("Help")));
		
		wait(2);
		
		switchToChildWindow();
		
		wait(2);
		
		String title2 = driver.getTitle();
		System.out.println("Title --> " + title2);
		
		wait(2);
		
		
		
		tearDown();
		
	}

}
