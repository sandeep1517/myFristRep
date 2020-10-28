package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HashMapping
{

   static HashMap<String ,String>loginapp()
	
        {
			HashMap<String,String> hm=new HashMap<String,String>();
			hm.put("x", "Sandeep.mahadik1717@sandeepmanu");
			hm.put("y", "mahadik@sandeep");
			
			return hm;
		}
		
		public static void main(String Arg[]) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");

			WebDriver driver=new FirefoxDriver();
			
			driver.get("http:\\www.gmail.com");
	
		
			HashMap<String, String> data=loginapp();
			
	
		   for(Map.Entry<String ,String>Str:data.entrySet())
			
		   {			
			 	
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(data.get(Str));
			
			driver.findElement(By.className("VfPpkd-RLmnJb")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		
			driver.findElement(By.className("VfPpkd-RLmnJb")).click();
			
			driver.close();
			}
        
		}
	
}
