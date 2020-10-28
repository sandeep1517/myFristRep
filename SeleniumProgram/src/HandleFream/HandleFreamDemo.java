package HandleFream;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleFreamDemo {

	@Test
	public void test() throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com");
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.id("authMobile")).sendKeys("7066724911");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='mobileSubmitBtn']")).click();
		
		Thread.sleep(3000);
			
		driver.close();
		
	
		
	}
}
