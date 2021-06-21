package com.orangehrm.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.TestBase;
import com.orangehrm.utils.ActionUtils;
import com.orangehrm.utils.ExplictWait;
import com.orangehrm.utils.PropertiesFileDataHandeling;
import com.orangehrm.utils.SeleniumUtils;

public class LoginPage extends TestBase
{

	SeleniumUtils selutils;
	PropertiesFileDataHandeling prop ;
	ExplictWait wait;
	TestBase tb;
	ActionUtils au ;
	
	@FindBy(name ="txtUsername")
	@CacheLookup
	private WebElement txt_username;
	
	@FindBy(name ="txtPassword")
	private WebElement txt_password;
	
	@FindBy(name ="Submit")
	private WebElement btn_submit;
	
	@FindBy(xpath = "//span[text() = \"Invalid credentials\"]")
	private WebElement erro_message;
	
	
	public LoginPage()
	{
		PageFactory.initElements(tb.driver, this);
	}
	 
	
	public void user_name_input() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		tb = new TestBase();
		selutils = new SeleniumUtils();
		String useranme = tb.GetPropertyValue("username");
		selutils.input_text(txt_username, useranme);
		
	}
	
	public void wrong_username() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		tb = new TestBase();
		selutils = new SeleniumUtils();
		String useranme = tb.GetPropertyValue("wrg_username");
		selutils.input_text(txt_username, useranme);
	}
	
	public void password_input() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		tb = new TestBase();
		selutils = new SeleniumUtils();
		String password = tb.GetPropertyValue("app_pass");
//		String pass = prop.GetPropertyValue("app_pass");
		selutils.input_text(txt_password, password);
		
	}
	
	public void click_submit_button()
	{
		selutils = new SeleniumUtils();
//		selutils.click(btn_submit);
//		 au = new ActionUtils();
//		 au.doubleclick(btn_submit);
	}
	
	public String wrmsg ()
	{
		String wrg_msg = selutils.return_text(erro_message);
		return wrg_msg;
		
	}
	
	public void wrong_pass() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		tb = new TestBase();
		selutils = new SeleniumUtils();
		String wrong_password = tb.GetPropertyValue("wrg_password");
//		String pass = prop.GetPropertyValue("app_pass");
		selutils.input_text(txt_password, wrong_password);
	}
	
}
