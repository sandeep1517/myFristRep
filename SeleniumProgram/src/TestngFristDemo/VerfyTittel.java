package TestngFristDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerfyTittel 
{
       
    @Test
	public void Verfy()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
	   //	driver.manage().window().maximize();
		
		String expected_title="Facebook – log in or sign up";
		
		String title=driver.getTitle();
		
		Assert.assertEquals(expected_title, title);
	
		System.out.println("==============Test Completed==============");

	    driver.close();
	    
	}
    
	
	
	
}
