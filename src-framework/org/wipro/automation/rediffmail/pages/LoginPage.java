package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.rediffmail.utilities.ReadPropFile;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username_textbox(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.read_element_data("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.read_element_data("login_password_name"))).sendKeys(pass);
	}
	
	public void click_rememebrme_checkbox() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.read_element_data("login_rememberme_css"))).click();
	}
	
	public void click_login_bttn() throws Exception
	{
		driver.findElement(By.className(ReadPropFile.read_element_data("login_loginbttn_class"))).click();
	}
}
