package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario3
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase_1");
		
		Assert.assertEquals("Hello", "Hello");	  //pass  //hard assertion
		
System.out.println("first_testcase_2");
		
		Assert.assertEquals("Hello", "Hello TestNG");//fail
		
System.out.println("first_testcase_3");
		
		Assert.assertEquals("Hello", "Hello TestNG");
		
	}
	
	@Test(enabled=false)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void registration()
	{
		System.out.println("registration_1");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("Hello", "Hello");	
		
		System.out.println("registration_2");
		
		sa.assertEquals("Hello", "Hello TestNG");
		
		System.out.println("registration_3");
		
		sa.assertEquals("Hello", "Hello TestNG");	
		
		sa.assertAll();
		
	}
	
	@Test(dependsOnMethods="registration")
	public void login()
	{
		System.out.println("login");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
