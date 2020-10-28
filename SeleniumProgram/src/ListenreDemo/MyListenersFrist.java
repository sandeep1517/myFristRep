package ListenreDemo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

@Listeners(ListenreDemo.ListenersTestNGFrist.class)
public class MyListenersFrist 
{
	WebDriver driver;
	@Test
    
	public void TittleVerify()
	{
	 
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/");
		System.out.println(driver.getTitle());
		
	}
	@Test
    public void test()
    {
		System.out.println(driver.getCurrentUrl());
	    Assert.assertTrue(true);
	    driver.close();
    }
	
}