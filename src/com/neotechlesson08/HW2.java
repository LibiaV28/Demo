package com.neotechlesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HW2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
      setUp(); 

//create the driver, decide which browser to use, maximize, go to url 
		
		//Waits:
			//implicit wait: I want to be patient with all elements, if an element is not there immediately
				//wait for some time before complaining  
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//CLick on the "Interaction" link 
		driver.findElement(By.id("menu-interactions")).click();
		
		//Click on "waits"
		driver.findElement(By.id("waits")).click();
		
		//Click on enable button 
		driver.findElement(By.id("btnEnable")).click();
	
		//Enter "hello" and verify text is entered successfully 
		
		//this textbox is there but not enabled
		WebElement textbox = driver.findElement(By.xpath("//form[@id='input-example']/input"));
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(textbox));
		
		//Difference in HW2 use a FluentWait 
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(20));
		fluentWait.pollingEvery(Duration.ofSeconds(2));
		fluentWait.until(ExpectedConditions.elementToBeClickable(textbox));
		
		
		
		
		textbox.sendKeys("Hello");
		
		Thread.sleep(3000);//rememebr this is for us to see what happens in the page 
						  //(in automation we remove it or comment out)
		
		
		tearDown();
	}

}
