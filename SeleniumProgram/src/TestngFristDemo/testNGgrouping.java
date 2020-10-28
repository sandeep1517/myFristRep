package TestngFristDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import IEBrowser.IEBrowser;

public class testNGgrouping 
{
	WebDriver driver;
	
	@Test(groups={"santiy-groups"})
	public void testone() 
	{
		System.out.println("=============first Test Execution=======");
			
		
	}
	
	@Test(groups={"sanity-groups"})
	public void testTwo() 
	{
		
		System.out.println("=============Second Test Execution=======");
	}
	
	@Test(groups={"sanity-groups"})
	public void testThree()
	{
		System.out.println("=============Third Test Execution=======");
	}
	

}
