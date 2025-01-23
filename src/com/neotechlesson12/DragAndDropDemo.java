package com.neotechlesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class DragAndDropDemo extends CommonMethods {
//https://jqueryui.com/droppable/
	public static void main(String[] args) {
		
		setUp();
		
		//notice that we have an iframe, and the element we need to drag is inside it
		
		switchToFrame(0);
		wait(2);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement dropArea = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(draggable, dropArea).perform();
		
		wait(5);
		

		//another way of doing drag and drop
//		action.clickAndHold(draggable).moveToElement(dropArea).release().perform();
		
		wait(5);
		
		tearDown();
		
	}

}
