package com.neotechlesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		//https://neotech.vercel.app/alerts
		
		
		setUp();
		
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(2000);
		
		Alert simpleAlert = driver.switchTo().alert();
		//if all i want driver.switchTo().alert().accept();
		String alertText = simpleAlert.getText();
		System.out.println("simple alert says: " + alertText);
		Thread.sleep(2000);
		simpleAlert.accept();
		
		Thread.sleep(2000);
		//trigger alert
		driver.findElement(By.id("btnConfirm")).click();
		Thread.sleep(2000);
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.dismiss();
		
		Thread.sleep(2000);
		
		//trigger prompt
		driver.findElement(By.id("btnPrompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("NeoTech");
		Thread.sleep(2000);
		promptAlert.accept();
		Thread.sleep(2000);
		
		
		
		
		
		tearDown();
		
		
}

}
