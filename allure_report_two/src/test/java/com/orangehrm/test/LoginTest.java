package com.orangehrm.test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.orange.base.TestBase;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.PropertiesFileDataHandeling;
import com.orangehrm.utils.SeleniumUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


public class LoginTest extends TestBase 
{
	
	
	LoginPage lp;
	TestBase tb;
	SeleniumUtils su;
	PropertiesFileDataHandeling pdh;
	
	Logger log = Logger.getLogger(LoginTest.class);
	
	@BeforeMethod(alwaysRun = true)
	public void open_browser() throws Throwable
	{
		tb = new TestBase();
		tb.openBrowser();
		log.info("log done");
	}
	
	@Test(priority = 1 , enabled = true ,  groups = "smoke"  )
	@Description ("Verify login") 
	@Epic("1001")
	@Feature("Feture - Login")
	@Story("SBC-5252")
	@Step("Verify loging step")
	@Severity(SeverityLevel.BLOCKER)
	public void login() throws Throwable
	{
		lp = new LoginPage();
		lp.user_name_input();
		lp.password_input();
		lp.click_submit_button();
//		su = new SeleniumUtils();
//		pdh = new PropertiesFileDataHandeling();
//		Assert.assertEquals(su.Title_name(), pdh.GetPropertyValue("app_title"));
		
	}
	
	@Test(priority = 2 , enabled = true , groups = "regression" , dependsOnMethods = "login")
	@Description ("Verify login with invlid test") 
	@Epic("1001")
	@Feature("Feture - Login")
	@Story("SBC-5253")
	@Step("Verify loging step with invlid text")
	@Severity(SeverityLevel.CRITICAL)
	public void login_invalid_text() throws Throwable
	{
		lp = new LoginPage();
		lp.wrong_username();
		lp.password_input();
		lp.click_submit_button();
		pdh = new PropertiesFileDataHandeling();
		Assert.assertEquals(lp.wrmsg(), pdh.GetPropertyValue("user_error_msg"));
		
	}
	
	@Test(priority = 3 , enabled = true ,  groups = "regression" , dependsOnMethods = "login" )
	@Description ("Verify login with invlid pssword") 
	@Epic("1001")
	@Feature("Feture - Login")
	@Story("SBC-5254")
	@Step("Verify loging step with invlid pssword")
	@Severity(SeverityLevel.NORMAL)
	public void invalid_pass() throws Throwable
	{
		lp = new LoginPage();
		lp.user_name_input();
		lp.password_input();
		lp.click_submit_button();
		pdh = new PropertiesFileDataHandeling();
		Assert.assertEquals(lp.wrmsg(),pdh.GetPropertyValue("user_error_msg") );	
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowaser()
	{
		tb = new TestBase();
		tb.Close_Browser();
	}

}
