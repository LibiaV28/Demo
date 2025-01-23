package com.neotechlesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTable extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//login
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//button")).click();
		
		
		//go to PIM -> Employee List
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		
		String expected = "Linda";
		
		for (int i = 0; i < rows.size(); i++)
		{
			String rowText = rows.get(i).getText();
			
			
			if (rowText.contains(expected)) //I found LINDA!!!!
			{
				//get the list of all third column items: 
				List<WebElement> thirdColumnItems = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[3]"));
				
				//click on the column item that intersects with the row that contains Linda
				thirdColumnItems.get(i).click();
				
				break;
			}
			
			
		}
		
		
		Thread.sleep(10000);
		
		
		tearDown();
	
	}

}
