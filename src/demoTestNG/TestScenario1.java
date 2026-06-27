package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		Assert.assertEquals("Hello", "Hello");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
		
		Assert.assertEquals("Hello", "Hello");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
		
		Assert.assertEquals("Hello", "Hello TestNg");
	}
	
	@Test
	public void forth__testcase()
	{
		System.out.println("forth__testcase");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
		
		Assert.assertEquals("Hello", "Hello TestNg");
	}
	
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
