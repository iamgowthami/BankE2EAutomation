package com.inetbankingv1.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//public static  Webdriver()
		
		System.setProperty("webdriver.chrome.driver", "E:\\MyAutomation\\inetbankingV1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.simplilearn.com/tutorials/maven-tutorial/maven-project-in-eclipse");
		Thread.sleep(9000);
		
		driver.quit();
		
		//System.out.println(setproperty);
	}

}
