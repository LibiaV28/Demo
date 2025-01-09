package com.neotechlesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicitWait extends BaseClass {

	public static void main(String[] args) {
		//https://neotech.vercel.app/waits
		
		setUp();
		
		//Explicit wait 
			//Is applied to a specific element -- not to the driver level 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//If the element is not found withing 15 second TimeoutException will be thrown 
		
		
		//Now, we can use the wait object to specify the waiting process 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
		
		WebElement button = driver.findElement(By.id("button1"));
		
		System.out.println("The invisible button is now visible: " + button.isDisplayed());
		button.click();
		
		

		tearDown();
		
	}

}
