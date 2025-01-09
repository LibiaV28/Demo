package com.neotechlesson02;

public class C_FirefoxDriver implements I_WebDriver {

	
	
	public C_FirefoxDriver()
	{
		System.out.println("Firefox is opening");
	}
	
	
	
	
	@Override
	public void get(String url) 
	{
		System.out.println("Firefox navigates to the " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("Firefox will get the title!");
		return "Page Title";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("Firefox will get the current url!");
		return "Current url";
	}

	@Override
	public void close() {
		System.out.println("Firefox is closing!");
	}

	@Override
	public void quit() {
		System.out.println("Firefox is quitting!");
	}

}
