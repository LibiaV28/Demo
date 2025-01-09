package com.neotechlesson07;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowHandlePractice extends BaseClass  {

	public static void main(String[] args) throws InterruptedException {
		
		// https://demoqa.com/browser-windows
		
		setUp();
		
		//Let's print the title of current tab (main window)
		System.out.println("Title --> " + driver.getTitle());
		
		String mainWindowHandle = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		
		//We still have the focus on the main window
			//The one opened by driver at the beginning (setUp())
		
		//How can we handle all windows?
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("Number of active windows:" + allWindowHandles.size());
		
		for (String handle : allWindowHandles)
		{
			//We will try to switch the focus to all windows except for the main page
			if (!handle.equals(mainWindowHandle))
			{
				//Now we switch to the page/tab
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				
				//Let's close the tabs/windows
				driver.close();
			}
		}
		
		tearDown();
	}

}
