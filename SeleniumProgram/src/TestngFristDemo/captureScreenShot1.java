package TestngFristDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.steadystate.css.util.Output;

public class captureScreenShot1{

	
	public static void SrceenShot(WebDriver driver,String name ) throws IOException 

	{
	  
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File scour=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scour,new File("C:\\Users\\dude\\workspace\\SeleniumProgram\\ScreenShot\\"+name+".png"));
		
        System.out.println("======ScreenShot Taken=====");		
		
        
	}

}
