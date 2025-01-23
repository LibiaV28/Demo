package com.neotechlesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class HW3 extends BaseClass {
	
	/*
		Homework 3:
		        Add Employee
		        Open chrome browser
		        Go to "https://hrm.neotechacademy.com/"
		        Login into the application
		        Click on PIM > Add Employee 
		        Add Employee
		        Log out 
		        Quit the browser 
	 
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login into the application
        driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		//Click on PIM > Add Employee 
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.linkText("Add Employee")).click();
        
        
        
        //we can see manually that the form does not immediately come up. 
        //the form takes a while to load - so the implicit wait might not do it for us 
        
        //I need to wait for the first name box to show up
        WebDriverWait firstNameWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        firstNameWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));
        
        //Add Employee
        driver.findElement(By.id("first-name-box")).sendKeys("John");
        driver.findElement(By.id("last-name-box")).sendKeys("Doe");
        
        //locate and fill the dropdown for Location 
        
        Select locationDD = new Select(driver.findElement(By.id("location")));
        locationDD.selectByVisibleText("New York Sales Office");
        
        Thread.sleep(1000);
        
        //save
        driver.findElement(By.id("modal-save-button")).click();
        
        
        WebDriverWait personalDetailsWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        personalDetailsWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));
        
        
        //Log out 
		driver.findElement(By.id("account-job")).click();
		driver.findElement(By.id("logoutLink")).click();
		
		
		tearDown();
	}

}
