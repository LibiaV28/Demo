package com.neotechlesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		/*
	 	Facebook login:
		➔ Open chrome browser
		➔ Go to “https://www.facebook.com/”
		➔ Enter invalid username and password and click login
		➔ User should see invalid user name Page.
		➔ Close the browser 
	 
	 */
	
	//Open the browser
	WebDriver driver = new ChromeDriver();
			
	//go to the url 
	driver.get("https://www.facebook.com/");
	
	//locate the web element (using id as locator) 
	WebElement usernameBox = driver.findElement(By.id("email"));
	
	//send the username 
	usernameBox.sendKeys("neo@gmail.com");
	
	Thread.sleep(5000);
	
	//locate and send the password 
	driver.findElement(By.id("pass")).sendKeys("password");
	
	Thread.sleep(5000);
	
	//click on login
	//driver.findElement(By.id("u_0_5_eK")).click();
	//I cannot use this id here, why? Because id value is dynamic (generated differently 
	//every time we load the page. 
	
	//instead I will use the name locator 
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(5000);
	
	//Quit the browser
	driver.quit();
	}

}
