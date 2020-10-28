package SeleniumCommands;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElements {

	public static void main(String[] args) throws InterruptedException 
	{
 
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
//		driver.get("https:// .facebook.com/");
//		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sandeep.mahadik1717");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sandeepmanu");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		driver.navigate().to(appUrl);
//		Boolean dis=driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
//		System.out.println(dis);
//	
//      System.out.println("All Function are Working Softly;");
//      driver.manage().deleteAllCookies();
        WebElement ele=driver.findElement(By.xpath("//input[@id='identifierId']"));
        Actions action=new Actions(driver);
        		action.moveToElement(ele).build().perform();

        		Thread.sleep(5000); 
		
		driver.close();
	}

}
