package demoTestNG;

import org.testng.annotations.Test;

public class TestScenario4
{

	@Test(groups="Smoke")
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test(groups="Sanity")
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test
	public void forth__testcase()
	{
		System.out.println("forth__testcase");
	}
	
	@Test(groups="Regression_4June")
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
