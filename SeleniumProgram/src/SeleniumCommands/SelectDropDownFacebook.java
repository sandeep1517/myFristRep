package SeleniumCommands;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
      
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 		driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
        Thread.sleep(3000);
        // It will be Select Day
        
        WebElement day_dropday=driver.findElement(By.xpath("//select[@id='day']"));
        WebElement day_dropmonth=driver.findElement(By.xpath("//select[@id='month']"));
        WebElement day_dropyear=driver.findElement(By.xpath("//select[@id='year']"));
        
        Select day_seld=new Select(day_dropday);
        Select day_selm=new Select(day_dropmonth);
        Select day_sely=new Select(day_dropyear);
        
        List<WebElement> day_name=day_seld.getOptions();
        List<WebElement> month_name=day_selm.getOptions();
        List<WebElement> year_name=day_sely.getOptions();
        int total_day=day_name.size();
        int total_month=month_name.size();
        int total_year=year_name.size();
         
        
        System.out.println("Total Day,Month,Year count is==>>"+total_day+" "+total_month+" "+total_year);
        
        for(WebElement ele:day_name)
        {
        	String san=ele.getText();
        	System.out.println("Day are ===>"+san);
        }
        
        driver.close();
 	}

}
