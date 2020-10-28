/**
 * 
 */
package com.gmailLogin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * @author dude
 * 
 * Page object created
 *
 */
public class GmailLogin 
{
   WebDriver driver;
	
    By username =By.id("identifierId");
	By clickbutton1=By.className("VfPpkd-RLmnJb");
	By password=By.xpath("//input[@class='whsOnd zHQkBf']");
    By clickbutton2=By.className("VfPpkd-RLmnJb");
   
    public GmailLogin(WebDriver driver)
    {
    	this.driver=driver;
    }
	public void userid(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void clickone()
	{
		driver.findElement(clickbutton1).click();
	}
	public void Password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clicktwo()
	{
		driver.findElement(clickbutton2).click();
	}

    
}
