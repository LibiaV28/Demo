package com.neotechlesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultipleSelectDropdown extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//url=https://neotech.vercel.app/select
		
		setUp();
		
		WebElement multiSelect = driver.findElement(By.id("multi-select"));
		
		
		//create a Select object 
		Select sel = new Select(multiSelect);
		
		
		boolean isMlp = sel.isMultiple();
		
		if (isMlp)
		{
			List<WebElement> options = sel.getOptions();
			
			for(WebElement el : options)
			{
				String text = el.getText();
				System.out.println("The visible text is: " + text);
				
				if (text.equals("New Jersey") || text.equals("California") || text.equals("New York"))
				sel.selectByVisibleText(text);
				Thread.sleep(2000);
			}
			
			sel.deselectByIndex(0);
			Thread.sleep(2000);

			sel.deselectAll();
			Thread.sleep(2000);

		}
		
		
		
		tearDown();


	}

}
