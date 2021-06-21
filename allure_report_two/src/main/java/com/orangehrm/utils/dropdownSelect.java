package com.orangehrm.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.orange.base.TestBase;

public class dropdownSelect extends TestBase 
{

	public static void selectfromdd(WebElement Element , String ddSelection)
	{
		Select s = new Select(Element);
		s.selectByVisibleText(ddSelection);
	}
}
