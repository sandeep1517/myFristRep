package handleMouseAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseAction {

	
	@Test
	public void test() throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	    
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.goibibo.com/flights/");
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//ul[@class='mainLinks']//li[@class='hdrMoreLink']//div[@class='padB10 lh1-2 iconText fmtTooltip']"))).build().perform();
			
		driver.findElement(By.xpath("//span[text()='Train Runing Status']")).click();
		
		driver.findElement(By.xpath("//input[@id='train_run_st_train_details']")).sendKeys("12009");

		//driver.findElement(By.xpath("//span[contains(text(),'Get Status')]")).click();
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Shatabdi Express']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Get Status')]")).click();
		
	    Thread.sleep(2000);
		
		driver.close();
	
	    
	}
	
	
	
}
