package com.neotechlesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass{

//		==================  HW_1_Handling Multiple Windows =======================
		//
//			1) Launch the browser and open the site "https://neotech.vercel.app/email"
//			2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//			3) On the Child Window, Enter your email ID and submit.
//			4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//			5) Close the Child window on which credentials are displayed.Switch to the parent window.
//			6) Quit all browsers


		public static void main(String[] args) throws InterruptedException {
			// https://neotech.vercel.app/email
			
			setUp();
			
			
			driver.findElement(By.linkText("Click Here")).click();
			Thread.sleep(2000);
			
			//OR
			//driver.findElement(By.partialLinkText("Click")).click();
			
			//At this point, we opened a new window but the focus is still on 
			//the main url window --> it means we have two window handles
			
			//How to get these handles? We use getWindowHandles()
			
			Set<String> handles = driver.getWindowHandles();
			
			Iterator<String> it = handles.iterator();
			
			String parentWindow = it.next();
			String childWindow = it.next();
			
			//We need to move/switch the focus to the childWindow/tab
			driver.switchTo().window(childWindow);
			
			//Now, we can locate the input element on childWindow
			driver.findElement(By.id("emailid")).sendKeys("test@me.com");
			Thread.sleep(2000);
			
			//Locate and click the Submit button
			driver.findElement(By.id("btnLogin")).click();
			
			//Let's get the username
			String username = driver.findElement(By.id("username")).getText();
			
			//Let's get the password
			String password = driver.findElement(By.id("password")).getText();
			
			System.out.println("User Name : " + username);
			System.out.println("Password : " + password);
			
			//To switch the focus back to the main window, we can either close the current tab or switchTo(parentWindow)
			
			driver.close();
			//OR
			//driver.switchTo().window(parentWindow);
				
				Thread.sleep(2000);
				
				
				tearDown();
	}

}
