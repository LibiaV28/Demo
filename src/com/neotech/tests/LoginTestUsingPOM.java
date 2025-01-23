package com.neotech.tests;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods{

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com/
		
		setUp();
		
		//Now, we need to create an object of LoginPage so that we can
		//have access to all defined attributes and actions(if any)
		LoginPage login = new LoginPage();
		
		//sending the username 
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//sending the password
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		//click button 
		click(login.loginBtn);
		//or
		//login.loginBtn.click();
		
		wait(3);
		
		//Now we should use the DashboardPage to have access to its elements 
		DashboardPage dashboard = new DashboardPage();
		
		//lets validate if the logo is displayed 
		
		if (dashboard.logo.isDisplayed())
		{
			System.out.println("Test Passed!");
		}
		else 
		{
			System.out.println("Test Failed!");
		}
		
		//Lets confirm that the employee logged in as "Jacqueline White"
		String actualName = dashboard.accountName.getText();
		String expectedName = "Jacqueline White";

				
		if (actualName.equals(expectedName))
		{
			System.out.println(expectedName + " is logged in.");
		}
		else 
		{
			System.out.println(expectedName + " is NOT logged in.");
		}
		
		wait(2);
		
		
		
		tearDown();
		
		
		
	}

}
