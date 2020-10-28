package SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSector {

	public static void main(String[] args) throws InterruptedException 
	{
   
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		//CssSelect or:- id(#)
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("sandeep.mahadik1717");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("sandeepmanu");
	
    	//CssSelector:-Contains(*) 
    	driver.findElement(By.cssSelector("button[id*='u']")).click();
    	driver.navigate().back();
    	//Xpath:-text()

    	driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
    	driver.navigate().back();

    	Thread.sleep(2000);
	
 		System.out.println("CssSelector Program Is Successfully Run");
        driver.close();
		
	}

}
