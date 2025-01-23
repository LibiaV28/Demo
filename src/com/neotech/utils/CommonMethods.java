package com.neotech.utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {
	
	
	/**
	 * This method clears a textbox and sends a text parameter to it.
	 * 
	 * @param element
	 * @param text
	 */
	
	public static void sendText(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	
	public static void clickRadioOrCheckbox(List<WebElement> elementList, String selectValue)
	{
		for (WebElement el : elementList)
		{
			String elementValue = el.getDomAttribute("value").trim();
			
			if (elementValue.equals(selectValue) && el.isEnabled())
			{
				el.click();
				break;
			}
		}
	}
	
	/**
	 * This method pauses the execution for a certain amount of seconds.
	 * 
	 * @param seconds
	 */
	
	public static void wait (int seconds)
	{
		try 
		{
			Thread.sleep(seconds * 1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method select a drop down element based on visible text
	 * 
	 * @param element
	 * @param visibleText
	 */
	
	public static void selectDropdown(WebElement element, String visibleText)
	{
		try
		{
		Select sl = new Select(element);
		sl.selectByVisibleText(visibleText);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	/**
	 * This method select a drop down element based on index
	 * 
	 * @param element
	 * @param index
	 */
	

	public static void selectDropdown(WebElement element, int index)
	{
		try
		{
		Select sl = new Select(element);
		sl.selectByIndex(index);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	/**
	 * This method switches the focus of the driver to an Alert and accepts it if found 
	 * if not found NoAlertPresentException is handled
	 */
	
	public static void acceptAlert()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch (NoAlertPresentException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method switches the focus of the driver to an Alert and dismisses it if found 
	 * if not found NoAlertPresentException is handled
	 */
	
	public static void dismissAlert()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		catch (NoAlertPresentException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method switches the focus of the driver to an Alert and return its text if found 
	 * If not found, NoAlertPresentException is handled
	 * @return
	 */
	
	public static String getAlertText()
	{
		String alertText = null; 
		
		try
		{
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();
		}
		catch (NoAlertPresentException e)
		{
			e.printStackTrace();
		}
		return alertText;
		
	}
	
	/**
	 * This method switches the focus of the driver to an Alert and sends text to it if found 
	 * If not found, NoAlertPresentException is handled
	 * @return
	 */
	
	public static void sendAlertText(String text)
	{
	
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
		}
		catch (NoAlertPresentException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * This method switched to a frame using its name or id
	 * @param nameOrId
	 */
	
	public static void switchToFrame(String nameOrId)
	{
		try
		{
			driver.switchTo().frame(nameOrId);
		}
		catch (NoSuchFrameException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method switched to a frame using its index
	 * @param index
	 */
	
	public static void switchToFrame(int index)
	{
		try
		{
			driver.switchTo().frame(index);
		}
		catch (NoSuchFrameException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method switched to a frame using a WebElement
	 * @param element
	 */
	
	public static void switchToFrame(WebElement element)
	{
		try
		{
			driver.switchTo().frame(element);
		}
		catch (NoSuchFrameException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	  *This method switches the focus of the drive to the child window
	 */

	public static void switchToChildWindow()
	{
		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles)
		{
			if (!mainWindow.equals(handle))
			{
				driver.switchTo().window(handle);
			}
		}
	}
	
	/**
	 * This method creates a wait object based on the driver and EXPLICIT_WAIT_TIME
	 * @return
	 */
	public static WebDriverWait getWaitObject()
	{
		return new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
	}
	
	/**
	 * This method will wait for the element to be visible.
	 * @param locator
	 * @return
	 */
	public static WebElement waitForVisibility(By locator)
	{
		return getWaitObject().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * This method will wait for the element to be visible.
	 * @param element
	 * @return
	 */
	
	
	public static WebElement waitForClickability(WebElement element)
	{
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will wait for the element to be clickable and then click it.
	 * @param element
	 */
	
	public static void click(WebElement element)
	{
		waitForClickability(element);
		element.click();
	}
}
