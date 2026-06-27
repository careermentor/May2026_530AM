package org.xyz.automation.testcases;

import org.openqa.selenium.WebDriver;  //ctrl+shift+o (import the class)
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserControl 
{
	
	WebDriver driver;
	
	@Test
	public void control_browser()
	{
		
		driver= new ChromeDriver();  //launch chrome browser
		
		driver.manage().window().maximize();
		
	
		driver.get("https://www.google.com/");
		
		//driver.get("https://www.saucedemo.com/");
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		driver.close();  //can close one window/tab only
		
		driver.quit();  //will close all the windows
		
	}
	
}
