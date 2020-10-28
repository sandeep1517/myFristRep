package SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCommand{
		
		public static void main(String args[]) throws InterruptedException{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
			WebDriver driver = new FirefoxDriver();
			Thread.sleep(4000);
			
			// get Method :-
			
			
			driver.get("https://www.facebook.com/");
			
			//getTitle Method :-
			
			String san=driver.getTitle();
			System.out.println("The Current Page Tittel Name is :"+san);
			
			//getCurrentUrl Method-
	        
			String can=driver.getCurrentUrl();
			System.out.println("The Current URL is Website : "+can);
			
			//getPageSource Method :-
		
		    String ban=driver.getPageSource();
			System.out.println("The Current Page Source is Website : "+ban);
			
			
		    System.out.println("Browser is launched successfully..hurray");
			
		    //Close Method :- 
		    
			driver.close();
			
		}
		
		
	}


	       