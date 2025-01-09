package com.neotechlesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllEbayLinks {
	
	public static final String url = "https://www.ebay.com/";
	

	public static void main(String[] args) {
		
		// get all ebay links
		// print the text on those that have
		// print the href attribute
		// count the number of links that have text

WebDriver driver = new ChromeDriver();
driver.get(url);

List<WebElement> allLinks = driver.findElements(By.tagName("a"));
int count = 0;


for (WebElement link : allLinks)
{
	if (!link.getText().isEmpty())
	{
		System.out.println(link.getText());
		System.out.println("- href: " + link.getDomAttribute("href"));
		count++;
	}
}

System.out.println("The total number of all a tags is: " + allLinks.size());
System.out.println("The total number of all a tags with text is: " + count);


driver.quit();
		
	}

}
