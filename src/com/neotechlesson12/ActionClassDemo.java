package com.neotechlesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionClassDemo extends CommonMethods {

	public static void main(String[] args) {
		//https://amazon.com/
		
		
		setUp();
		
		Actions action = new Actions(driver);
		
		WebElement el = driver.findElement(By.id("nav-link-accountList"));
		
		//if i dont call .perform() at the end of the action, then it wont happen
		action.moveToElement(el).perform();
		
		wait(5);
		
		//lets check if the curse is moved to the right location by verifying the menu text 
		
		WebElement divEl = driver.findElement(By.id("nov-flyout-ya-newCust"));
		
		if (divEl.getText().contains("Start"))
		{
			System.out.println("Menu is displayed!");
		}
		else
		{
			System.out.println("Test failed!");
		}
		
		//how do I perform a right click
		action.contextClick().perform();
		
		wait(5);
		
		//go to the search box and then search for books
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		action.moveToElement(searchBox).click().sendKeys("books").doubleClick().perform();
		

		//we can do these actions separately
		/*
		 * action.moveToElement(searchBox).perform(); wait(2);
		 * action.sendKeys("books").perform(); wait(2); action.doubleClick().perform();
		 */		
		
		wait(4);
		
		
		tearDown();
		
	}

}
