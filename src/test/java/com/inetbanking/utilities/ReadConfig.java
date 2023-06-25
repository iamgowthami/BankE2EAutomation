package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig(){

		File src = new File("./Configurations/Config.properties");
		try{
		FileInputStream fls = new FileInputStream(src);
		pro = new Properties();
		pro.load(fls);
		}catch(Exception e){
		System.out.println("Exception is" + e.getMessage());
		}
		
		}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getUserPassWord() {
		String Pwd = pro.getProperty("password");
		return Pwd;
	}
	
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getIEPath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefox");
		return firefoxpath;
	}



		 
}
