package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.base.TestBase;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

public class HomePageTest extends TestBase
{
	HomePage hp;
	TestBase tb;
	LoginPage lp;
	
	@BeforeMethod(alwaysRun = true)
	public void open_browser() throws Throwable
	{
		tb = new TestBase();
		tb.openBrowser();
	}
	
	@Test(priority = 1,enabled = true , description = "Click on User",groups = {"regression","smoke"} )
	public void click_on_user() throws Throwable
	{
		lp = new LoginPage();
		lp.user_name_input();
		lp.password_input();
		lp.click_submit_button();
		hp = new HomePage();
		hp.ClickOnUser();
	
//		Assert.assertEquals(false, true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void quite_browser()
	{
		tb = new TestBase();
		tb.Close_Browser();
	}
}
