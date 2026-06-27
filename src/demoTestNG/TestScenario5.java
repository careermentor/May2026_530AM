package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario5
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		Assert.assertEquals("Hello", "Hello TestNg");
	}
	
	@Test(groups={"Smoke","Regression"})
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
		
		Assert.assertEquals("Hello", "Hello TestNg");
	}
	
	@Test(groups="Regression")
	public void forth__testcase()
	{
		System.out.println("forth__testcase");
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
