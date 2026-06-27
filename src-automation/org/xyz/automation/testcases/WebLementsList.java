package org.xyz.automation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebLementsList 
{

	
	@Test
	public void productlist()
	{
		WebDriver driver = new EdgeDriver();
		
		 // Open Application
	    driver.get("https://www.saucedemo.com/");

	    // Maximize Window
	    driver.manage().window().maximize();

	    // Enter Username
	    WebElement username = driver.findElement(By.id("user-name"));
	    username.sendKeys("standard_user");

	    // Enter Password
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("secret_sauce");

	    // Click Login Button
	    WebElement loginBtn = driver.findElement(By.id("login-button"));
	    loginBtn.click();
	    //org.openqa.selenium.NoSuchElementException: no such element: 
	    
	    List<WebElement> productlist = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
	    
	    System.out.println(productlist.size());  //0
	   // productlist.get(1).click();
	    //java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
	    
	}

   
	
}
