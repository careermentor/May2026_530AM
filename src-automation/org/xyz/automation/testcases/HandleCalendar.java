package org.xyz.automation.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  //ctrl+shift+o (import the class)
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleCalendar 
{
	
	WebDriver driver;
	
	@Test(enabled=false)
	public void calender_textbox()
	{
		
		driver= new ChromeDriver();  //launch chrome browser
		
		driver.manage().window().maximize();
		
	
		driver.get("https://practice-automation.com/calendars/");
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2000-05-10");
		
		driver.findElement(By.cssSelector("[aria-label='Wed May 10 2000Use the space key to select the date.']")).click();
		
	}
	
	@Test
	public void calender_icon() throws Exception
	{
		
		driver= new ChromeDriver();  //launch chrome browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.agoda.com/");
		
		driver.findElement(By.cssSelector("[data-selenium='checkInText']")).click();
		
		driver.findElement(By.cssSelector("[aria-label='Sat Jul 04 2026']")).click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("[aria-label='Sun Jul 05 2026']")).click();
		
	}
	
}
