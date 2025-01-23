package com.neotechlesson11;

public class Notes {

	/*
	- Initial steps --> everything in one class (the same testing code)
	- Centralized structure --> place repeated steps in separate classes with static methods:
		
		BaseClase
		    |
		     driver
		     setUp()
		     teardown()
setup() --> preparation steps for the test --> loading reading configuration file
					   --> creating the driver object
					   --> maximizing the browser
					   --> going to the predefined url
tearDown() --> closing the browser 

		ConfigsReader 
			|
			prop
			readProperties()
			getProperty()

		Constants
			| 
			CONFIGURATION_FILEPATH

- to create a test, we extend the BaseClass and have centralized access to test preparation and termination

Now, we will create another centralized class for methods that we possibly would use
- sending a text
- selecting a menu item
- waiting for an element 
- etc.
Let's call this class CommonMethods
- CommonMethods will require the driver object for many of its methods --> we use inheritance 

BaseClass
    |
CommonMethods
    |
   Test1,2,...
   
   */
}
