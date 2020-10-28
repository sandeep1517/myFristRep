package handleMouseAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import SeleniumCommands.WebElementsCommand;

public class mouseActiondragdrop {

	
	@Test
	public void test() throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	    
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
	
		driver.switchTo().frame(0);
		
		WebElement src= driver.findElement(By.id("draggable"));
		
		WebElement traget=driver.findElement(By.id("droppable"));
		
		Actions action =new Actions(driver);
		
		
		Thread.sleep(3000);
		
		action.clickAndHold(src).moveToElement(traget).release().perform();;
		
		Thread.sleep(5000);
		
		System.out.println("SuccessFull DragDrop===");
		
		driver.close();
		
	
	    
	}
	
	
	
}
