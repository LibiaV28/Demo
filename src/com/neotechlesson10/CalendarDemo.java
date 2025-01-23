package com.neotechlesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://www.delta.com/
		
		setUp();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("document.body.style.zoom='75%'");
		
		
		//there are some elements located in some seconds, so lets apply an implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("calDepartLabelCont")).click();
		Thread.sleep(4000);

		
		//lets select July, 20 for departure 
				//locate the month 
		
		String currentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		

		
		//We should check if its July or not
				//if not, move to next month until you get July
		
		while(!currentMonth.equals("July"))//initially you would find on current month (January) --> move to July
		{
			//We click on the arrow to move to next month 
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//Update the month value after moving to the next one
			currentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();	
		}
		Thread.sleep(4000);
		
		//Lets locate the day 
				//To do that, we collect all available td(s) from the table and match their text to the day we want 
		
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));
		//this will get us 105 elements --> we are interested only in one --> (20)
		
		//let iterate on the days find out match (20) and then click on it and break 
		
		for(WebElement day : days)
		{
			String dayNum = day.getText();
			
			if (dayNum.equals("20"))
			{
				day.click();
				break;
			}
		}
		Thread.sleep(4000);
		
		//Lets make the return day on August 30
		//repeat the process of finding the month, then the day and click 
		
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!returnMonth.equals("August"))
		{
			//we click on the arrow to move to next month 
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//Update the month value after moving to the next one
			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		Thread.sleep(4000);
		
		List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));
		
		//Now, we iterate to get the day 30, click on it, then break
		
		for (WebElement day : returnDays)
		{
			String dayNum = day.getText();
			
			if (dayNum.equals("30"))
			{
				day.click();
				break;
			}
		}
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@value='done']")).click();
		Thread.sleep(4000);
		
	
		
		
		
		
		
		
		
		tearDown();
		
		
		
	
		
	}

}
