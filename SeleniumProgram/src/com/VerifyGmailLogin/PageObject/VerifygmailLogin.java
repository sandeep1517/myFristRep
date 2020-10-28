package com.VerifyGmailLogin.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gmailLogin.pageObject.GmailLogin;

public class VerifygmailLogin 
{
 
	@Test
	public void login() throws Exception
	{
		
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");

	   WebDriver driver=new FirefoxDriver();
        
	   driver.get("http:\\www.gmail.com");
	
	   driver.manage().window().maximize();
	   
	   GmailLogin login=new GmailLogin(driver);
	   
	   
	    login.userid("sandeep.mahadik1717");

	    login.clickone();
	    
	    Thread.sleep(3000);  
	   
	    login.Password("sandeepmanu");
	    
	    login.clicktwo();
	    
	    Thread.sleep(3000);
	    
	    driver.close();
   
	    System.out.println("====TestCompleted====");
	} 
	
	
}
