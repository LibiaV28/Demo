package com.neotechlesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
//		=================   HW_2_Handling Frames =================================
		//
//			1) Launch the browser and open the site "https://neotech.vercel.app/iframe/multi2"
//			2) Verify on the page header "Not a Friendly Topic" displayed
//			3) Click on the Inner Frame Check box
//			4) Choose Dog from Animals dropdown
//			5) Quit the browser


	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/iframe/multi2
		
		setUp();
		
		String label = driver.findElement(By.xpath("//span")).getText();
		
		System.out.println(label.equals("Not a Friendly Topic"));
		Thread.sleep(2000);
		
		//To check the inner-frame-check-box, we must switch the focus into
		//the parent frame first, then into the child, after that we can check the element
		
		//Moving to parent frame
		driver.switchTo().frame("nested1");
		//OR
		//driver.switchTo().frame(0);
		
		//Now, we should move to the inner frame
		driver.switchTo().frame("child-frame");
		
		driver.findElement(By.id("inner-frame-check-box")).click();
		Thread.sleep(2000);
		
		//Now, let's move the focus into the default content back again
		driver.switchTo().defaultContent();
		
		//Switch the focus into animals iframe
		driver.switchTo().frame("animals");
		//OR
		//driver.switchTo().frame(1);
		Thread.sleep(2000);
		
		//Locate the selection element
		Select sel = new Select(driver.findElement(By.id("animal-select")));
		
		sel.selectByVisibleText("Dog");
		
		Thread.sleep(2000);
		
		tearDown();

	}

}
