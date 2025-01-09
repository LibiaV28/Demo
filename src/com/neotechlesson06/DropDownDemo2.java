package com.neotechlesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//locate the element
		WebElement oldMenu = driver.findElement(By.id("oldSelectMenu"));
		//this element is a select tag 
		Select s1 = new Select(oldMenu);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		
		//locate the other drop menu
		WebElement otherMenu = driver.findElement(By.id("demo-multiple-name"));
		//this element has a label tag
		otherMenu.click();
		Thread.sleep(3000);

		
		
		
		
		tearDown();
	}

}
