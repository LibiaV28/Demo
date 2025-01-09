package com.neotechlesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertsDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		driver.findElement(By.id("customerId")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
		//at this point I have triggered the alert!
		Thread.sleep(2000);
		
		//shift the focus from the page to the alert 
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("The simple alert text is: " + alertText);
		
		simpleAlert.dismiss();//cancel
		//we are now back on the page 
		
		//lets click again to open the alert again
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert secondAlert = driver.switchTo().alert();
		secondAlert.accept();
		
		//when I clicked "Ok", another alert trigger
		
		Alert lastConfirmationAlert = driver.switchTo().alert();
		System.out.println(lastConfirmationAlert.getText());
		Thread.sleep(2000);
		lastConfirmationAlert.accept();
		
		
		
		
		
		tearDown();
		
	}

}
