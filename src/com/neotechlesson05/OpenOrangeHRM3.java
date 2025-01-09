package com.neotechlesson05;

import com.neotech.utils.BaseClass;

public class OpenOrangeHRM3 extends BaseClass {

	
	public static void main(String[] args) throws InterruptedException {
		
		//Setup the environment for testing 
		setUp();
		
		//write your test cases
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		//Close the browser
				tearDown();
	}

}
