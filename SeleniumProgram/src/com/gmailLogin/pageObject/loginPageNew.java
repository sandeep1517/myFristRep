package com.gmailLogin.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPageNew 
{
	
	WebDriver driver;
	
	public loginPageNew(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="identifierId")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.CLASS_NAME,using="VfPpkd-RLmnJb")
	@CacheLookup
	WebElement Click_button1;
	
	@FindBy(how=How.XPATH,using="//input[@class='whsOnd zHQkBf']") 
	@CacheLookup
	WebElement pass;

    @FindBy(how=How.CLASS_NAME,using="VfPpkd-RLmnJb")
	@CacheLookup
    WebElement Click_button2;
    
    public void login(String uname,String pas) throws Exception
   
    {
    	username.sendKeys(uname);
    	
    	Click_button1.click();
    	
    	Thread.sleep(3000);
    	
    	pass.sendKeys(pas);
    	
    	Click_button2.click();
    	
    	driver.close();
    }
    
}
