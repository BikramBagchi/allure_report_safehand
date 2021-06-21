package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.TestBase;
import com.orangehrm.utils.ActionUtils;
import com.orangehrm.utils.ExplictWait;

public class HomePage extends TestBase
{
  ActionUtils au;
  ExplictWait ew;
  
  @FindBy(id = "menu_admin_viewAdminModule")
  private WebElement Admin;
  @FindBy(id ="menu_admin_UserManagement")
  private WebElement User_Management;
  @FindBy(id ="menu_admin_viewSystemUsers")
  private WebElement User;
	
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}

 public SystemUserPage ClickOnUser()
 {
	 ew.elementvisiable(Admin);
	 Admin.click();
	 au.mouseover(User_Management);
//	 User.click();
	return new SystemUserPage();
	
	 
 }
 
}
