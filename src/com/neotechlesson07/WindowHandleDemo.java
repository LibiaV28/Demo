package com.neotechlesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowHandleDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://accounts.google.com/signup
		
		setUp();
		
		System.out.println("Title --> " + driver.getTitle());

		System.out.println("Window Handle --> " + driver.getWindowHandle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("Number of handles: " + allWindowHandles.size());
		
		Iterator<String> it = allWindowHandles.iterator();
		
		String window1 = it.next();
		String window2 = it.next();
		
		System.out.println("Window1 --> " + window1);
		System.out.println("Window2 --> " + window2);
		
		Thread.sleep(2000);
		
		//If we don't move the focus, we would be on the same original url page
		//If we want to move to a tab, we should switchTo()
		
		//switch to the other window
		driver.switchTo().window(window2);
		Thread.sleep(2000);
		
		//To verify that we moved, let's get the title and display it
		String title2 = driver.getTitle();
		
		System.out.println("Title --> " + title2);
				Thread.sleep(2000);
				
				driver.close();
				Thread.sleep(2000);
				
				tearDown();

	}

}
