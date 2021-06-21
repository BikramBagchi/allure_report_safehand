package com.orange.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	
	public static WebDriver driver ;
	public static WebDriver delegate  ;
	public static Properties prop;
	public static TestBase tb;
	public static int i;
	public static int y;
	public Object[][] data;
	
	
	public void openBrowser() throws Throwable
	{
		
		TestBase tb;
		prop = new Properties();
		FileInputStream fil = new FileInputStream("H:/allure_report_two/Config_data/"
				+ "config.properties");
		
		prop.load(fil);
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("URL");
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver =  new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get(url);
		    driver.manage().window().maximize();
//		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(05, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		}
	}
	
	public void Close_Browser()
	{
		driver.close();
	}
	
	public String GetPropertyValue (String Key) throws Throwable
	{
		prop = new Properties();
		FileInputStream fil = new FileInputStream("H:/allure_report_two/Config_data/"
				+ "config.properties");
		
		prop.load(fil);
		String browser = prop.getProperty(Key);
		return browser;
		
	}

	
	
	
	

}
