package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class Tc_AddNewCustomer_002 extends BaseClass 
{
	@Test
	public void AddNewCustomer() throws InterruptedException, IOException{
		
		 logger.info("url is opened");
		 
		 LoginPage lp = new LoginPage(driver);
		 lp.setUserName(username);
		 logger.info("Enter user name");

		 lp.setUserPassword(password);
		 logger.info("Enter password");
		 
		 lp.clickSubmit();
		 
		 
		 AddNewCustomerPage addcus = new AddNewCustomerPage(driver);
		 
		 logger.info("adding new customer details");

		 addcus.clickOnAddNewCustomer();
		 logger.info("Click on addnewcustomer link");
		 Thread.sleep(4000);
		 //addcus.cancelAd();;
		 addcus.switchToIframe();
		 addcus.switchToIframe1();
		 addcus.switchToIframe2();
		 addcus.switchToDefaultContent();
		 
		 addcus.Addcustomername("karthik");
		 addcus.SelectGender("male");
		 addcus.EnterDateofBirth("05", "16", "1997");
		 addcus.CusAdress("1-1,mamidigumpulavaripalli");
		 addcus.CusCity("madanapalli");
		 addcus.CusState("hyd");
		 addcus.CusPinNum("123456");
		 addcus.CusTeleNum("1234565455");
		 addcus.CusEmailId("mngr506705");
		 addcus.CusPwd("YjamAqy");
		 addcus.ClickOnSubmitbtn();
		 
		 Thread.sleep(3000);
		 
			logger.info("validation started....");
			
			boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
			
			if(res==true)
			{
				Assert.assertTrue(true);
				logger.info("test case passed....");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"addNewCustomer");
				Assert.assertTrue(false);
			}
				
		}
		
		 
		
		
	}
	


