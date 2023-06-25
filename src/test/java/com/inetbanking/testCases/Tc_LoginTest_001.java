package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass
{
	@Test
	public void LoginTest() throws IOException {
		
		 
		 logger.info("url is opened");
		 
		 LoginPage lp = new LoginPage(driver);
		 lp.setUserName(username);
		 logger.info("Enter user name");

		 lp.setUserPassword(password);
		 logger.info("Enter password");

		 
		 lp.clickSubmit();
		 
		 if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		 {
			 Assert.assertTrue(true);
			 logger.info("login test passed");

				 
			 }
		 else {
			 
			 captureScreen(driver,"LoginTest");
			 Assert.assertTrue(false);
			 logger.info("login test failed");
		
	}
	

}
}
