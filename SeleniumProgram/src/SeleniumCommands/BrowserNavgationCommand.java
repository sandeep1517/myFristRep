package SeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavgationCommand {

	public static void main(String[] args)throws InterruptedException
	
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(4000);	
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
	}

}
