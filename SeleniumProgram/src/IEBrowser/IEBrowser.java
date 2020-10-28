package IEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IEBrowser {

	public static void main(String[] args)throws Exception
	{

		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\geckodriver-v0.27.0-win64\\geckodriver.exe");
	//	Thread.sleep(4000);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
