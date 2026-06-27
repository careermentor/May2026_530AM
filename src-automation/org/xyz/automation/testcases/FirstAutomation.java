package org.xyz.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  //ctrl+shift+o (import the class)
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

public class FirstAutomation 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		
		driver= new ChromeDriver(co);  //launch chrome browser
		//driver = new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//https://mail.rediff.com/cgi-bin/login.cgi
		//Rediffmail - Free Email for Login with Secure Access
		
		Assert.assertEquals(driver.getTitle(), "Rediffmail - Free Email for Login with Secure Access");
		
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
		
		
	}
	
	
	@Test(enabled=true)
	public void register_functionlaity()
	{
		
		
		driver.findElement(By.cssSelector("[title='Create new Rediffmail account']")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://register.rediff.com/register/register.php?FormName=user_details");
		
		//WebElement login = driver.findElement(By.className("signin-btn"));  //landmark
		
		//relative locator
		//driver.findElement(with(By.xpath("//a[@title='Create new Rediffmail account']")).below(login)).click();
		
		//driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']")).click();
		
		//driver.findElement(By.partialLinkText("Get a new Rediffmail ID"));
		
		String fullName_text = driver.findElement(By.xpath("//label[text()='Full Name']")).getText();
		
		Assert.assertEquals(fullName_text, "Full Name");
		
		String act_fullname_textbox = driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder");
		
		Assert.assertEquals(act_fullname_textbox, "Enter your full name");
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");
		
		//date of birth
		
		Select dob_month = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		
		//dob_month.selectByIndex(2);  //FEB
		//dob_month.selectByValue("05");  //MAY
		dob_month.selectByVisibleText("SEP");
		//dob_month.selectByContainsVisibleText("JU");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		 Actions act = new Actions(driver);
		    
		    act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//label[text()='Select a Security Question']"))
				, "Select a Security Question"));
		
		Select hintq = new Select(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")));
		hintq.selectByVisibleText("What is the name of your first school?");
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		//driver.findElement(By.xpath("")).click();
		
	}

	@Test(enabled=false)
	public void login_functionlaity()
	{
		WebElement username_textbox = driver.findElement(By.id("login1"));
		
		username_textbox.sendKeys("it_john");
		
		username_textbox.clear();
		
		username_textbox.sendKeys("john.seo");
		
		driver.findElement(By.name("passwd")).sendKeys("pass1234");
		
		System.out.println(driver.findElement(By.id("remember")).isSelected()); //true
		
		driver.findElement(By.id("remember")).click();  //uncheck
		
		System.out.println(driver.findElement(By.id("remember")).isSelected()); //false
		
		
		//driver.findElement(By.className("signin-btn")).click();
		
		System.out.println(driver.findElement(By.className("signin-btn")).getLocation());
		
		System.out.println(driver.findElement(By.className("signin-btn")).isEnabled()); //true
		
		System.out.println(driver.findElement(By.className("signin-btn")).isDisplayed()); //true
		
		//System.out.println(driver.getPageSource());
		
				
	}
	
}
