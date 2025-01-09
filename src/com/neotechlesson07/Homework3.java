package com.neotechlesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework3 extends BaseClass{

	/* 
	 * Open Chrome browser
	 * Go to "https://neotech.vercel.app/select"
	 * Click on multi select drop down and
	 * select "Oliver Hansen" and "Van Henry"
	 * Verify value has been selected 
	 * Deselect 1 of the options from the dropdown 
	 * Quit Browser 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement multiSelection = driver.findElement(By.id("demo-multiple-name"));
		multiSelection.click();

		
		//Click on multi select drop down 
		//driver.findElement(By.id("demo-multiple-name")).click();
		Thread.sleep(3000);
		
		//select "Oliver Hansen" and "Van Henry"
		driver.findElement(By.xpath("//li[text()='Oliver Hansen']")).click();
		driver.findElement(By.xpath("//li[text()='Van Henry']")).click();
		Thread.sleep(3000);
		
		//Verify that Oliver Hansen has been selected 
		//We will use multiSelection variable to get the selected elements
		String selection = multiSelection.getText();
		
		if (selection.contains("Oliver Hansen"))
		{
			System.out.println("Test passed!");
		}
		else
		{
			System.out.println("Test failed!");
		}
		
		//Deselect 1 of the options from the dropdown
		//Let's deselect (remove) Oliver Hansen
		driver.findElement(By.xpath("//li[text()='Oliver Hansen']")).click();

		Thread.sleep(2000);

		
		tearDown();
		
		
	}

}
