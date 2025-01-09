package com.neotechlesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//https://neotech.vercel.app/waits
		
		//implicit wait is applied to all ELEMENTS!!
		setUp();
		
		//Waiting for the URL to load after its been loaded is useless 
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		//Implicit Wait 
				//(1) Its used at the driver level --> it will be applied for all elements located by the driver 
				//(2) Its applicable for fineElement() and fineElements()
						//When we try to locate an element or elements the implicit time will be applied to this process 
		
		//If the request is sent directly with no wait, and the element is still not loaded then we would get NoSuchElementException
			//If the element is found at any point before the time is over, there will be no more wait 
			//If the element is not found until the time is over, then the driver will check one last time 
			//and again if not found, then throw NoSuckElementException 
		//By default implicit wait is 0 second
		
		//If we want to set the implicit time to 15 seconds.
				//right after the driver is initialized --> for now, right after calling setUp();
				//this wait will be for every element we try to locate 	
					// and it will remain until the driver is terminated 
				//the default polling/checking time is 0.5 second
				//It will wait until either the element is found or the time is over 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//the driver will wait up to 15 seconds while locating any element 
		
		WebElement button = driver.findElement(By.id("button1"));
		button.click();
		
		Thread.sleep(3000);
		
		tearDown();
	}

}
