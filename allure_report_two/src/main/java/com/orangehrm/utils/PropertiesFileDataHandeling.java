package com.orangehrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesFileDataHandeling 
{

	public Properties prop;
	
	public String GetPropertyValue (String Key) throws Throwable
	{
		prop = new Properties();
		FileInputStream fil = new FileInputStream("H:/Maven_Project_OrangeHRM/Config_data/"
				+ "config.properties");
		
		prop.load(fil);
		String browser = prop.getProperty(Key);
		return browser;
		
	}
	
}
