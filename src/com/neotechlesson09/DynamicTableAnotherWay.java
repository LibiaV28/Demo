package com.neotechlesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTableAnotherWay extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// log in

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		driver.findElement(By.xpath("//button")).click();

		// go to PIM -> Employee List

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();

		Thread.sleep(3000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));

		String expected = "Linda";

		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();

			if (rowText.contains(expected)) // if the row contains Linda
			{
				// on the previous way:
				// get all the third column elements
				// click on the element found on the same index as i

				// the other way:

				// use the index i to build the xpath, and only click directly on that element

				// table[@id='employeeListTable']/tbody/tr[6]/td[3] --> this is path that allows
				// me to click
				// directly on the row x and column 3 of the table
				String lindasXpath = "//table[@id='employeeListTable']/tbody/tr[" + (i + 1) + "]/td[3]";
				System.out.println(lindasXpath);

				WebElement lindasRow = driver.findElement(By.xpath(lindasXpath));
				lindasRow.click();

				break;
			}
		}

		tearDown();
		
		
		
	}

}
