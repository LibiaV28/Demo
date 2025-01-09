package com.neotechlesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static final String url = "https://fs2.formsite.com/meherpavan/form2/index.html";

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		
		WebElement maleRb = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		maleRb.click();
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Thread.sleep(2000);
		
		WebElement wednesday = driver.findElement(By.cssSelector("label[for='RESULT_CheckBox-8_3']"));
		wednesday.click();
		
		Thread.sleep(2000);
		
		//we clicked directly on Male or Female or Wednesday
		//What if we do not know on which one we need to click?
			//we are reading the data, and we have to decide on runtime which one to click
		
		//driver.findElement() --> finds a single element and returns it
		//driver.findElements() --> we use it to locate multiple elements at once
									//and returns a list of WebElements 
		
		
		//Assumption: I want to click on Female radio button and Saturday checkbox

		//I searched on how to locate all the 9 elements I need: 
			//I need to find a way that describes all of them 
			//1. className:  multiple_choice animate
			//2. we notice the elements are inside the table with a particular class name: 
				// //table[@class='inline_grid choices']//label
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='inline_grid choices']//label"));
		
		
		for (WebElement element : elements)
		{
			String text = element.getText();
			
			if (text.equals("Female"))
			{
				element.click();
			}
			else if (text.equals("Saturday"))
			{
				element.click();
			}
			else
			{
				System.out.println("I don't want to click on " + text);
			}
			
			Thread.sleep(2000);
			
		}
		
		
		
		driver.quit();
		
	}

}
