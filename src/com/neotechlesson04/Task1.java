package com.neotechlesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
/*
	Open chrome browser
	Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
	Enter valid username and password
	Click on login button
	Then verify "Web Orders" is displayed and also username is displayed right top corner
	*/
	
	
	public static final String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	
		
		WebElement header = driver.findElement(By.tagName("h1"));
		
		if(header.isDisplayed())
		{
			System.out.println("The header " + header.getText() + " is displayed!");
		}
		else
		{
			System.out.println("Header is not displayed!");
		}
		
		
		
		WebElement loginText = driver.findElement(By.className("login_info"));
		System.out.println(loginText.getText());
		
		
		if (loginText.getText().contains("Tester"))
		{
			System.out.println("Tester Logged in successfully!");
		}
		else 
		{
			System.out.println("Login Failed!");
		}
		
		
		driver.quit();
		
		
	}

}
