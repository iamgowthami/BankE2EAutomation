package com.inetbankingv1.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovePopUpAds {
	 public static void main(String[] args) {
		 
		 
		 try {
			    WebDriver driver;
			    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
			    driver = new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    Thread.sleep(2000);
			    driver.get("https://demo.guru99.com/");
			    driver.manage().window().maximize();
			    Thread.sleep(2000);
			    driver.get("https://demo.guru99.com/V4/");
			    driver.findElement(By.name("uid")).sendKeys("mngr506705");
			    driver.findElement(By.name("password")).sendKeys("YjamAqy");
			    driver.findElement(By.name("btnLogin")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.linkText("New Customer")).click();
			    Thread.sleep(5000);
			            WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
			    driver.switchTo().frame(frame1);
			    WebElement frame2 = driver.findElement(By.id("ad_iframe"));
			    driver.switchTo().frame(frame2);
			    driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
			    driver.switchTo().defaultContent();
			    Thread.sleep(5000);
			    driver.findElement(By.name("name")).sendKeys("gowthami");
			    System.out.println("successfully removed");

		   
			    driver.close();
			    driver.quit();
			} catch (Exception e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}

}
}
