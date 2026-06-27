package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.pages.LoginPage;
import org.wipro.automation.rediffmail.pages.LoginPage_PF;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validate_login_functionality_valid_credential() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_username_textbox("John1");
		login.enter_password_textbox("pass1234");
		login.click_rememebrme_checkbox();
		//login.click_login_bttn();
		
		//because "this.driver" is null
	}
	
}
