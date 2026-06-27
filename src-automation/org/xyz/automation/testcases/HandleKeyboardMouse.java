package org.xyz.automation.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandleKeyboardMouse 
{

	public static void main(String[] args) throws Exception {
		
		HandleKeyboardMouse ms = new HandleKeyboardMouse();
		ms.tc01_handleFrames();
	}
	
	public void tc01_handleFrames() throws Exception
	{
		WebDriver driver = new EdgeDriver();
	    driver.get("https://demoqa.com/frames");
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
	    
	    driver.switchTo().frame("frame1");
	    
	    System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
	    
	    driver.switchTo().defaultContent();
	    
	    SoftAssert sa = new SoftAssert();
	    sa.assertEquals(driver.findElement(By.xpath("//h1[text()='Frames']")).getText(), "Frame");
	    
	    driver.switchTo().frame("frame1");
	    
	    sa.assertEquals(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText(), "This is a sample pag");
	    
	    CaptureScreenshot.testresult(driver,"tc01_handleFrames");
	    
	    sa.assertAll();
	}
	

	@Test(enabled=true)
	public void tc02_handleAlert() throws Exception
	{
		WebDriver driver = new EdgeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.className("signin-btn")).click();
	    
	    driver.switchTo().alert().accept();
	    
	    CaptureScreenshot.testresult(driver,"tc02_handleAlert");

	}
	    
	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.mphasis.com/home.html");
	    driver.manage().window().maximize();
	    
	    Actions act = new Actions(driver);
	   // act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
	    
	   act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
	  // act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
	   
	   act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
	   
	  //  act.scrollToElement(driver.findElement(By.xpath("//span[text()='ENTERPRISE AGENCY PLATFORM, GOVERNED']"))).perform();

	 Set<String> windowsid =   driver.getWindowHandles();
	 System.out.println(windowsid);
	 
	 Iterator<String> itr = windowsid.iterator();
	 System.out.println(itr);
	 
	 String homepage = itr.next();
	 String healthcare = itr.next();
	 
	 driver.switchTo().window(healthcare);
	 
	 System.out.println(driver.getTitle());
	// Thread.sleep(Duration.ofSeconds(2));
	// driver.switchTo().window(homepage);
	 
	 
	   
	// act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
	 
	}
	
	@Test(enabled=false)
	public void handleKeyboard()
	{
		WebDriver driver = new EdgeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();

	    Actions act = new Actions(driver);
	    
	   // act.sendKeys(Keys.PAGE_DOWN).perform();
	    
	    act.sendKeys("john1").perform(); //username
	    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
	    act.sendKeys(Keys.TAB).perform();
	    act.sendKeys("john1234").perform(); //password
	    //act.sendKeys(Keys.ENTER).perform();
	    
	    
	 	    
	}

   
	
}
