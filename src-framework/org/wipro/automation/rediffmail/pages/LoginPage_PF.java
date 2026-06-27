package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.rediffmail.utilities.ReadPropFile;

public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement username_textbox;
	
	@FindBy(name="passwd")
	WebElement password_textbox;
	
	@FindBy(css="[type='checkbox']")
	WebElement rememberme_checkbox;
	
	@FindBy(className="login_loginbttn_class")
	WebElement loginbttn_click;

	public void enter_username_textbox(String uname) throws Exception
	{
		//WebElement username_textbox = driver.findElement(By.id(ReadPropFile.read_element_data("login_username_id")));
		username_textbox.sendKeys(uname);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		password_textbox.sendKeys(pass);
	}
	
	public void click_rememebrme_checkbox() throws Exception
	{
		rememberme_checkbox.click();
	}
	
	public void click_login_bttn() throws Exception
	{
		loginbttn_click.click();
	}
}
