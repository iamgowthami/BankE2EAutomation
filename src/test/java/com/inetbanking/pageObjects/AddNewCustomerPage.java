package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	WebDriver ldriver;
	
	public  AddNewCustomerPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement lnkAddnewcustomer;
	
	@FindBy(id = "google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")
	@CacheLookup
	WebElement frame1;
	
	@FindBy(id = "ad_iframe")
	@CacheLookup
	WebElement frame2;
	
	@FindBy(xpath="//div[@id='dismiss-button']/div/span")
	@CacheLookup
	WebElement frame3;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement entercustomername;
	
	@FindBy(name = "rad1")
	@CacheLookup
	WebElement selectgender;
	
	@FindBy(id = "dob")
	@CacheLookup
	WebElement enterdob;
	
	@FindBy(xpath="1")
	@CacheLookup
	WebElement entercusaddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement entercityname;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement cusstatename;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement cuspinno;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement custeleno;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement cusemailid;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement cuspassword;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement clicksubmit;

	
	
	
	public void clickOnAddNewCustomer() {
		lnkAddnewcustomer.click();
		
	}
	
//	   public void cancelAd() {
	 //       adCloseButton.click();
	//    }
	
	   public void switchToIframe() {
	        ldriver.switchTo().frame(frame1);
	    }
	   
	   public void switchToIframe1() {
	        ldriver.switchTo().frame(frame2);
	    }
	   
	   public void switchToIframe2() {
		   frame3.click();
	    }
	   
	    public void switchToDefaultContent() {
	    	ldriver.switchTo().defaultContent();
	    }

	
	public void Addcustomername(String cname) {
		entercustomername.sendKeys(cname);
		
	}
	
	public void SelectGender(String gender) {
		selectgender.sendKeys(gender);
		
	}

	public void EnterDateofBirth(String mm, String dd, String yy) {
		enterdob.sendKeys(mm);
		enterdob.sendKeys(dd);
		enterdob.sendKeys(yy);
		
	}
	
	public void CusAdress(String cusadd) {
		entercusaddress.sendKeys(cusadd);
		
	}
	
	public void CusCity(String cuscityname) {
		entercityname.sendKeys(cuscityname);
		
	}
	
	public void CusState(String cusstate) {
		cusstatename.sendKeys(cusstate);
		
	}
	
	public void CusPinNum(String cuspin) {
		cuspinno.sendKeys(cuspin);
		
	}
	
	public void CusTeleNum(String custele) {
		custeleno.sendKeys(custele);
		
	}
	
	public void CusEmailId(String cusemail) {
		cusemailid.sendKeys(cusemail);
		
	}
	
	public void CusPwd(String cuspasswod) {
		cuspassword.sendKeys(cuspasswod);
		
	}
	
	public void ClickOnSubmitbtn() {
		
		clicksubmit.click();
	}
	
	

}
