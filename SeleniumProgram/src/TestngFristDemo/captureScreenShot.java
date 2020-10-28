package TestngFristDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class captureScreenShot
{

	@Test
	public void captureScreen() throws Exception
	{
	
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();

	    driver.manage().window().maximize();

		captureScreenShot1.SrceenShot(driver,"ld");
		
		driver.get("http:\\www.gmail.com");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sandeep.mahadik1717");
		
		captureScreenShot1.SrceenShot(driver,"Email");
		
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		Thread.sleep(2000);
		
		captureScreenShot1.SrceenShot(driver, "Password");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sandeepmanu");
		
		
		System.out.println("Test Completed");
		
		
		driver.close();
		
	}
	
	
}
