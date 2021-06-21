package com.orangehrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orange.base.TestBase;



public class SeleniumUtils extends TestBase
{

	 
	ExplictWait wa;
	TestBase tb ;
	
	public String Title_name()
	{
		
		String title = tb.driver.getTitle();
		return title;
		
	}
	
	public void input_text(WebElement Element , String value  )
	{
		Element.clear();
		Element.sendKeys(value);
		
	}
	
	public void click(WebElement Element)
	{
	   wa = new ExplictWait(); 
	   wa.WaitStillClickable(Element);
	   Element.click();
	}
	
	public static String return_text(WebElement Element)
	{
		String actual_text = Element.getText();
		return actual_text;
		
	}
	
	public static void sendvaletotextbox(WebElement Element , String txtvalue)
	{
		Element.clear();
		Element.sendKeys(txtvalue);
	}
}
