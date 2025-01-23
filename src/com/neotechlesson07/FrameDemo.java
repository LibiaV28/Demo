package com.neotechlesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//https://jqueryui.com/tooltip/
		
		setUp();
		
		//if we try to send the age without moving the focus into the frame
		//we would get NoSuchElementException
			// why? --> the focus is currently on the default contents which doesnt have this element
			//Its inside a frame (iFrame)
		
		//1. switch to the frame by index
		driver.switchTo().frame(0);
		
		WebElement age = driver.findElement(By.id("age"));
		
		age.sendKeys("42");
		
		//driver.findElement(By.id("age")).sendKeys("42"); no need to use bc we created WebElement 
		Thread.sleep(2000);
		
		//Lets try to click on some button in the default page contents 
			//unable to do step below directly bc without switching back to the main page contents, 
			//we will not be able to locate any of its elements 
			//we must switch back to it, and then locate and do the action 
		//driver.findElement(By.linkText("Button")).click();
	
		driver.switchTo().defaultContent();
		//driver.findElement(By.linkText("Button")).click();
		//Thread.sleep(3000);

		
		//2. Switch to frame by name or ID
			//driver.switchTo().frame(frameNameOrID); for this example we have no name or id 
		
		//3. Switch to frame by WebElement, you can also use //iframe
		WebElement frameE1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameE1);
		age.clear();
		Thread.sleep(2000);
			//lets send a new age value 
		age.sendKeys("30");
		Thread.sleep(2000);
		
		//If your test requires getting back to the default contents, then switch back to default 
		driver.switchTo().defaultContent();
		

		
		
		
		
		
		
		
		tearDown();
		
		
	}

}
