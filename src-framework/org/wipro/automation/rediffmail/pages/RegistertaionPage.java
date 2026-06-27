package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.rediffmail.utilities.ReadPropFile;

public class RegistertaionPage 
{

	WebDriver driver;
	
	public RegistertaionPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_newrediffmailid_link() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.read_element_data("login_getnewrediffmailid_xpath"))).click();
	}
	
	public void enter_fullname_textbox(String fname) throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_fullname_css"))).sendKeys(fname);
	}
	
	
	public void enter_rediffmailid_textbox(String email) throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_rediffmail_css"))).sendKeys(email);
	}
	
	
	public void select_dob_day_dropdown(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_dob_day_css"))));
		dob_day.selectByVisibleText(day);
	}
	
	public void click_gender_female() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.read_element_data("register_gender_female_xpath"))).click();
	}
	
	}
