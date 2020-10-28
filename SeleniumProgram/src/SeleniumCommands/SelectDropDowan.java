package SeleniumCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDowan {

	public static void main(String[] args) throws InterruptedException 
	{
      
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 		driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
        Thread.sleep(3000);
        // It will be Select Day
        
        WebElement day_drop=driver.findElement(By.xpath("//select[@id='day']"));
        
        Select day_sel=new Select(day_drop);
        
        day_sel.selectByIndex(1);
        System.out.println("It is Day====>>>"+day_sel);
        
        // It will be Select Month
        WebElement month_drop= driver.findElement(By.xpath("//select[@id='month']"));
        
        Select month_sel=new Select(month_drop);
        
        month_sel.selectByValue("3");
        System.out.println("It is Month====>>>"+month_sel);

        // It will be Select Year
        WebElement year_drop= driver.findElement(By.xpath("//select[@id='year']"));
        
        Select year_sel=new Select(year_drop);
       
        year_sel.selectByValue("1990");
        System.out.println("It is Year====>>>"+year_sel);
        Thread.sleep(3000);    
        driver.close();
 		
	}

}
