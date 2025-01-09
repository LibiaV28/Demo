package com.neotechlesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
	

	public static final String url = "https://fs2.formsite.com/meherpavan/form2/index.html";
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(url);
		
		//Lets locate the element multiple times
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("May");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("RESULT_TestField-1")).clear();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("John");
		
		//2nd way: reusing the same object 
		WebElement lastName = driver.findElement(By.id("RESULT_TextField-2"));
		lastName.sendKeys("Test");
		Thread.sleep(2000);
		lastName.clear();
		Thread.sleep(2000);
		lastName.sendKeys("Doe");
		
		WebElement phone = driver.findElement(By.cssSelector("input#RESULT_TextField-3"));
		phone.sendKeys("123-456-7890");
		Thread.sleep(2000);
		phone.clear();
		Thread.sleep(2000);
		phone.sendKeys("132-456-7890");
		Thread.sleep(2000);
	
		String maxLength = phone.getAttribute("maxlength");
		System.out.println("The max length is " + maxLength);

		
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.name("RESULT_TextField-4"));
		
		String countryClass = country.getAttribute("class");
		System.out.println("The class attribute value of the country is: " + countryClass);
		
		
		//Lets get the text value inside a web element 
		
		//options to locate the h1 element
			// //h1[text()='Volunteer Sign Up']
			// //div[@id="q19"]//h1
		
		WebElement title = driver.findElement(By.xpath("//div[@id='q19']//h1"));
		
		String titleText = title.getText();
		System.out.println("The header text is: " + titleText);
		
		
		driver.quit();



	}

}
