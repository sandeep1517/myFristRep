package SeleniumCommands;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSelectDrop 
{

	public static void main(String args[])
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        driver.manage().window().maximize();
		List<WebElement> dri= driver.findElements(By.name("cars"));
		
	}
	
	
	
}
