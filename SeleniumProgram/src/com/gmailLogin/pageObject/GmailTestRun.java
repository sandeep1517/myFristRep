package com.gmailLogin.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.VerifyGmailLogin.PageObject.verifyBrowerGmailLogin;

public class GmailTestRun 
{
  @Test
  public void run() throws Exception
  {
	 WebDriver driverl= verifyBrowerGmailLogin.browers("https:\\www.gmail.com");
	
	loginPageNew log= PageFactory.initElements(driverl, loginPageNew.class);
   
	log.login("sandeep.mahadik1717","sandeepmanu");
	
	System.out.println("Congratulation testCaseRun=====>>");
	

  }
	
} 
