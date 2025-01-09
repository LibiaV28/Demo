package com.neotechlesson02;

public interface I_WebDriver {
	
	//any variable I declare will be public static final 
	//any method I declare will be public abstract
	
	/*
	 * This method is so cool!
	 * You give it the url and it will take you there!
	 * 
	 * @param url
	 */
	
	public void get(String url);
	
	public String getTitle();
	
	public String getCurrentUrl();
	
	public void close();
	
	public void quit();


	

}
