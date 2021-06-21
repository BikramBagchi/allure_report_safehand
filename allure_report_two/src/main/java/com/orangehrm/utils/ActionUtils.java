package com.orangehrm.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orange.base.TestBase;
import com.orangehrm.pages.SystemUserPage;

public class ActionUtils extends TestBase 
{

	TestBase tb;
	
	public static void doubleclick (WebElement Element)
	{
		Actions dc = new Actions(driver);
		dc.doubleClick(Element).build().perform();
	}
	
	public static void mouseover (WebElement Element)
	{
		Actions dc = new Actions(driver);
		dc.moveToElement(Element);
	}
	
	
}
