package com.neotechlesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class FluentWaitDemo extends BaseClass {

	public static void main(String[] args) {
		
		// https://neotech.vercel.app/waits
		
		//We can use both implicit and explicit waits in the same test
		
		setUp();
		
		//Explicit waits:
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until();
	
		//FluentWait
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	
	//What wait details do we need to include?
	
	wait.withTimeout(Duration.ofSeconds(15));
	//wait.pollingEvery(Duration.ofSeconds(1));
	//wait.ignoring(NoSuchElementException.class); //Not necessary, but it's just an example
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
	
	WebElement button = driver.findElement(By.id("button1"));
	
	System.out.println("The invisible button is now visible: " + button.isDisplayed());
	button.click();
	
		
		tearDown();
	}

}
