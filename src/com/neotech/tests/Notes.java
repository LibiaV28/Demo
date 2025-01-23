package com.neotech.tests;

public class Notes {

	/*
	 Page Object Model
	--> for each web page/application, we create an object
		- the object will be created from a class that has all page elements as attributes 
		
	LoginPage.java --> username, password, and loginBtn
	DashboardPage.java --> logo and accountName
	
	LoginTestUsingPOM.java
			--> create an object of LoginPage when you are already on that page	
			--> create an object of DashboardPage when you are already on that page
		Why? Because if you try to insantiate before reaching to the specific page, 
		you would end up having NoSuchElementExeption thrown.
		
		We need a POM implementation that does not search for elements once 
		we instantiate the page object, rather, it will compose the elements 
		once they are used in our instructions --> PageFactory 
		lazy instiation
	 */
}
