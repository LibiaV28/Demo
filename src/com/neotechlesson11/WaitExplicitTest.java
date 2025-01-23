package com.neotechlesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class WaitExplicitTest extends CommonMethods {

	public static void main(String[] args) {
		//https://neotech.vercel.app/waits
		
		setUp();
		
		
		//waitForVisibility(By.id("button1"));
		
		WebElement button = driver.findElement(By.id("button1"));
		
		System.out.println("The invisible button is now visible: " + button);
		button.click();
		
		//If you want, you could use our click method without applying
		//any wait time --> why? bc its already applied in Constants or commonMethods
		
		
		
		
		
		tearDown();
		
		
		
		
		
	}
	
	

}
