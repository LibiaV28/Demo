package com.neotechlesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//If we want test anything in a web-application, we should follow these steps
		
			//1. Open the browser
					WebDriver driver = new ChromeDriver();
					
			//2. Go to the URL
					driver.get("https://www.neotechacademy.com/");
					
			//3. Do the require test/actions 
					//We will pause the web-page for a few seconds to properly see it 
					Thread.sleep(5000);	//Pause the execution for five second
					
			//4. Close browser
					driver.quit();
		
	}

}
