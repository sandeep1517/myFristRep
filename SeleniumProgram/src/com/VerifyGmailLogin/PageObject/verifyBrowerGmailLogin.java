package com.VerifyGmailLogin.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyBrowerGmailLogin 
{

	static WebDriver driver;
	
	public static  WebDriver browers(String BrowerUrl)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");

		driver=new FirefoxDriver();
		
	    driver.manage().window().maximize();
		
	    driver.get(BrowerUrl);
		
	    System.out.println("Brower Start=====>>");
		
		return driver; 
				
		
	}
}
