package SeleniumCommands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class SelectDropAssi {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 		driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
        Thread.sleep(3000);
        WebElement san=driver.findElement(By.xpath("//select[@id='month']"));
        Select name= new Select(san); 
        List realList=new ArrayList();
        List<WebElement>month=name.getOptions();
        for(WebElement ele:month)
        {
        	String data =ele.getText();
        	realList.add(data);
        }
         List temp=new ArrayList();
         temp.addAll(realList);
         
         Collections.sort(temp);
         
         if(realList==temp)
         {
        	 System.out.println("It Is Assinding DropdwonList");
         }
         else
         {
        	 System.out.println("It Is Assinding Not DropdwonList");
         }
	
		driver.close();
	}

}
