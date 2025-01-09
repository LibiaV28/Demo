package com.neotechlesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//https://demoqa.com/nestedframes/
		
		setUp();
		
		//To move the focus into Parent Frame, we should switchTo() parent frame 
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		
		//Switch to the child frame
		WebElement childFram = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFram);
		
		//To get the text from the child frame, we can locate its element and then display it
		WebElement element = driver.findElement(By.xpath("//body/p"));
		String text = element.getText();
		
		System.out.println("The text inside the child frame is " + text);
		
		//Where are we at this point?
			//We are inside child 
			//From child, we can go to parent or defaultContent()
		
		//1. Back to the parent
//		driver.switchTo().parentFrame(); //Direct parent
		
		//2. Directly to defualtContnet()
		driver.switchTo().defaultContent();
		
		tearDown();
		
		
		
		
	}

}
