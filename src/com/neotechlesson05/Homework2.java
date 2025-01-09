package com.neotechlesson05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{
	/*
	 * Radio Button Practice Open chrome browser Go to
	 * "https://demoqa.com/radio-button" Verify if all radio buttons are displayed
	 * and clickable Click on all radio buttons Verify radio buttons has been
	 * clicked successfully Quit browser
	 */

	public static void main(String[] args) {
		
setUp();
		
		List<WebElement> rb = driver.findElements(By.xpath("//input[@type='radio']"));
		List<WebElement> rbLabels = driver.findElements(By.xpath("//label[contains(@class, 'custom-control')]"));
		
		for (int i = 0; i < rb.size(); i++)
		{
			if(rbLabels.get(i).isDisplayed())
			{
				System.out.print(rbLabels.get(i).getText() + " is displayed");
			}
			else 
			{
				System.out.print(rbLabels.get(i).getText() + " is NOT displayed");
			}
			
			if (rb.get(i).isEnabled())
			{
				System.out.println(" and enabled!");
				rbLabels.get(i).click();
			}
			else 
			{
				System.out.println(" and NOT enabled!");
			}
			
			WebElement selection = driver.findElement(By.xpath("//span[@class='text-success']"));
			
			if(selection.getText().equals(rbLabels.get(i).getText()))
			{
				System.out.println(rbLabels.get(i).getText() + " is selected!");
			}
			else
			{
				System.out.println(rbLabels.get(i).getText() + " is NOT selected!");
			}
			
		}
		
		
		tearDown();

	}

}
