 package TestngFristDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDependancy 
{
  
  WebDriver driver;
  
  @Test
  public void startapp()
  {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
         driver=new FirefoxDriver();  
	     driver.get("https://www.gmail.com/");
	     //driver.manage().window().maximize();
	     //String url=driver.getCurrentUrl();
	     //Assert.assertTrue(url.contains("https://www.gmail.com/"));
	
	     System.out.println("==========Start Application===========");
  }
	
  @Test(dependsOnMethods="startapp")
  public void loginapp() throws InterruptedException
  {
	    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sandeep.mahadik1717@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sandeepmanu");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		System.out.println("===========login Successfully==========");
	 }
  
  @Test(dependsOnMethods="loginapp")
  
  public void logoutapp()
  {
	   driver.findElement(By.xpath("//img[@class='gb_va']")).click();
	   driver.findElement(By.xpath("//img[@class='gb_La gbii']")).click();
	   driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	   System.out.println("===========logOut Successfully==========");
	   driver.close();
  }
	
	
}
