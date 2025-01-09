package com.neotechlesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
	
	public static final String url = "https://sis.neotechacademy.com";

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		
		//location elements 
		driver.findElement(By.name("tUsername")).sendKeys("Admin");
		driver.findElement(By.name("tPassword")).sendKeys("Neotech$123");
		driver.findElement(By.name("tUsername")).sendKeys("");
		driver.findElement(By.name("tUsername")).sendKeys("");
		
		
		
		
		
		
		driver.quit();
	}

}
