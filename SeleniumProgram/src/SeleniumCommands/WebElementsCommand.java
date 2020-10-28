package SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsCommand {

	public static void main(String[] args)throws Exception {

		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(4000);	
		driver.get("https://www.youtube.com/");
		driver.manage();
		driver.findElement(By.id("//*[@id='search']")).sendKeys("sandeep mahadik");
		
		driver.close();
	
	}

}
