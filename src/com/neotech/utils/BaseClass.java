package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static void setUp(){
	
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		String browser = ConfigsReader.getProperty("browser");
		
		switch (browser.toLowerCase())
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		default:
			//We could use Chrome as a case to cover the possibility of no match 
			//driver = new ChromeDriver();
			break;
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		driver.manage().window().maximize();
		String url = ConfigsReader.getProperty("url");
		driver.get(url);
	}
		
  public static void tearDown()
		{
			if(driver != null)
			{
				driver.quit();
			}
		
		
	}
}
