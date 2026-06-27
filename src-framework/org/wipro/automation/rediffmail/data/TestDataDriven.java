package org.wipro.automation.rediffmail.data;

import org.testng.annotations.DataProvider;

public class TestDataDriven 
{

	@DataProvider(name="Login")
	public Object[][] login_data()
	{
		//String data1 = "John1";
		//Object[] data2 = {"John1", "johnpass1"};
		Object[][] data3 = {{"John1", "johnpass1"},{"David1", "Davidpass1"},{"Neena1", ""}};
		
		return data3;
	}
	
	
	
}
