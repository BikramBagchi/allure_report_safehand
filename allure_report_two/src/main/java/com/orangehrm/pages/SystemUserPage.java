package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.TestBase;
import com.orangehrm.utils.ExplictWait;
import com.orangehrm.utils.SeleniumUtils;
import com.orangehrm.utils.dropdownSelect;

public class SystemUserPage extends TestBase
{
	ExplictWait ew;
	dropdownSelect dds;
	SeleniumUtils su;
	
	@FindBy(xpath="//input[@id=\"btnAdd\"]")
	private WebElement Add;
	@FindBy(id="systemUser_userType")
	private WebElement ddUserRole;
	@FindBy(id ="systemUser_employeeName_empName")
	private WebElement txtemployeename;
	@FindBy (id ="systemUser_password")
	private WebElement txtpassword;
	@FindBy (id ="systemUser_confirmPassword")
	private WebElement txtcnfpassword;
	@FindBy (xpath = "//input[@value=\"Add\"]")
	private WebElement addButton;
	@FindBy (xpath = "//input[@name=\"btnCancel\"]")
	private WebElement cancle ;
	
	
	public SystemUserPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonadduser()
	{
		ew.elementvisiable(Add);
		Add.click();
		ew.elementvisiable(ddUserRole);
		dds.selectfromdd(ddUserRole, "Admin");
		su.sendvaletotextbox(txtemployeename, "testAutomation");
		su.sendvaletotextbox(txtpassword, "12345678");
		su.sendvaletotextbox(txtcnfpassword, "12345678");
		
	}
	
	public void exceldatapassuser(Object object, Object object2 , Object object3)
	{
		ew.elementvisiable(addButton);
		addButton.click();
		ew.elementvisiable(ddUserRole);
		dds.selectfromdd(ddUserRole, "Admin");
		txtemployeename.sendKeys(object.toString());
		txtpassword.sendKeys(object2.toString());
		txtcnfpassword.sendKeys(object3.toString());
		
	}
	
	public void dataprovider(Object empname , Object pass1 , Object pass2)
	{
		ew.elementvisiable(Add);
		Add.click();
		ew.elementvisiable(ddUserRole);
		dds.selectfromdd(ddUserRole, "Admin");
		txtemployeename.sendKeys(empname.toString());
		txtpassword.sendKeys(pass1.toString());
		txtcnfpassword.sendKeys(pass2.toString());
		cancle.click();
	}
	
	public void createuserone(String empname, String pass , String conpass)
	{
	
		ew.elementvisiable(Add);
		Add.click();
		ew.elementvisiable(ddUserRole);
		dds.selectfromdd(ddUserRole, "Admin");
		txtemployeename.sendKeys(empname);
		txtpassword.sendKeys(pass);
		txtcnfpassword.sendKeys(conpass);
	}
	
	
	
}
