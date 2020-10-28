package SeleniumCommands;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class ErrorHandling {
    
	public static void main(String[] args) throws InterruptedException 
    {

    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 		driver.get("https://www.gmail.com/");
 		//driver.findElement(By.xpath("//div[contains(text(),'Use another account')]")).click();
        driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
        String text_data=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
        
        String text_temp="Enter an email or phone number";
    
        if(text_temp==text_data)
        {	
        System.out.println("text Match"); 
        }    
        else
        {
            System.out.println("text Not Match"); 
        }
        Thread.sleep(3000);
    	driver.close();
	}

}
