package com.neotechlesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	/*
	 * Amazon Department List Verification 
	 * Open "chrome browser 
	 * Go to "http://amazon.com/"
	 * Verify how many departments options 
	 * Print each department 
	 * select computers
	 * quit browser 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		Thread.sleep(10000);
		
		WebElement department = driver.findElement(By.id("searchDropdownBox"));
		
		Select departmentDd = new Select(department);
		
		List<WebElement> options = departmentDd.getOptions();
		
		System.out.println("There are: " + options.size() + " departments");
		
		for (WebElement e : options)
		{
			System.out.println(e.getText());
		}
		
		//Extra bonus 
		//Lets search for a book in Books
		
		//Select Books from the list of dropdown 
		departmentDd.deselectByVisibleText("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The 48 Laws of Power");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//This part is left for you 
		  //verify the result is correct!
		Thread.sleep(2000);
		
		
		tearDown();
	}

}
