package com.neotechlesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Task1 extends BaseClass{
	/*
	 
	TC 1: Disciplinary Cases Search Validation

	Open chrome browser
	Go to https://hrm.neotechacademy.com/
	Login into the application
	Select Discipline
	Select Disciplinary Cases
	Click on Filter (Up-Right next to Help)
	Select from June 6, 2022 to July 15, 2022
	Click on Search
	Validate that there are no rows in result table
	Quit the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_discipline_defaultDisciplinaryView")).click();
		driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();

		Thread.sleep(2000);

		// The filter element is in a different frame, so should switch to it
		// Switching into its frame
		driver.switchTo().frame("noncoreIframe");
		// OR
		// driver.switchTo().frame(0);

		driver.findElement(By.id("searchModal")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();

		// Let's locate the month
		driver.findElement(By.xpath(
				"//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//div[@class='select-wrapper picker__select--month']"))
				.click();

		// Select the month --> July
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//span[text()='July']"))
				.click();

		// Click to the select the year
		driver.findElement(By.xpath(
				"//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//div[@class='select-wrapper picker__select--year']//input"))
				.click();

		// Select the year
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//span[text()='2022']"))
				.click();

		Thread.sleep(3000);

		// Now let's find and click on the day
		// Get all days in list, then loop and find the day
		List<WebElement> days = driver
				.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateFrom_table']//td"));

		for (WebElement day : days) {
			if (day.getText().equals("6")) {
				day.click();
				break;
			}
		}
		Thread.sleep(3000);

		// Select other date --> July, 15

		// Click on the calendar
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();

		// Choose the month

		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//span[text()='July']"))
				.click();

		// click on the year

		driver.findElement(By.xpath(
				"//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//div[@class='select-wrapper picker__select--year']//input"))
				.click();
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//span[text()='2022']"))
				.click();

		// Now let's find and click on the day
		// Get all days in list, then loop and find the day
		List<WebElement> days2 = driver
				.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']//td"));

		for (WebElement day : days2) {
			if (day.getText().equals("15")) {
				day.click();
				break;
			}
		}

		// click search
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);

		tearDown();

	}

}
