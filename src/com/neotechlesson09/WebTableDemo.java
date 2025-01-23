package com.neotechlesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class WebTableDemo extends BaseClass{

	public static void main(String[] args) {
// https://neotech.vercel.app/tables/2

		setUp();

		// can I get all the text of the table??

		System.out.println(driver.findElement(By.id("task-table")).getText());

		// But table is a big element, and we can get every chunk of it/

		System.out.println("-------------TABLE HEADER----------------");

		List<WebElement> headerData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		// table[@id='task-table'] --> locates the table
		// thead ---> a tag for Table Header
		// tr ---> a tag for table row
		// th ---> a tag for table header (cols)

		Iterator<WebElement> it = headerData.iterator();

		while (it.hasNext()) {
			String headerText = it.next().getText();

			System.out.print(headerText + " | ");

		}

		System.out.println();

		// we can get the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']//tr"));
		System.out.println("The number of rows on the table is: " + rows.size());
		// // ---> in locators this denoted a relative path
		// //table[@id='task-table'] ---> Locates the table
		// //tr ---> locate all the rows inside this table

		System.out.println("-------------TABLE DATA----------------");

		List<WebElement> data = driver.findElements(By.xpath("//table[@id='task-table']//td"));

		for (WebElement td : data) {
			System.out.println(td.getText());
		}

		// What does this do?
		System.out.println(data.get(2).getText());

		tearDown();
	}

}
