package dataProviderExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1
{
	Execlimport ele;
	public WebDriver driver;
	
	
	@Test(dataProvider="sandeep")
	public void DataProviderExcel(String FirstName,String lastname,String email)throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		driver.findElement(By.xpath("//input[@id='u_1_b']")).clear();
		driver.findElement(By.xpath("//input[@id='u_1_b']")).sendKeys(FirstName);
		
		driver.findElement(By.xpath("//input[@id='u_1_d']")).clear();
		driver.findElement(By.xpath("//input[@id='u_1_d']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@id='u_1_g']")).clear();
		driver.findElement(By.xpath("//input[@id='u_1_g']")).sendKeys(email);
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	@DataProvider(name="sandeep")
	public Object[][] data() throws Exception

	{
	    ele=new Execlimport("C:\\Users\\dude\\workspace\\SeleniumProgram\\src\\com\\data\\testdata\\data\\TestData1.xlsx","Sheet1");
	    //int rows=ele.getRowCount("Sheet1");
		//System.out.println("rows are;"+rows);
	      // int startrow=ele.getrow(1);
	        
	
	    int  startrow=1;
		Object[][] data1=new Object[3][3];
		for(int i=startrow;i<3;i++)
		{
			
		    data1[i][0]=ele.getData( i, 0);
			data1[i][1]=ele.getData( i, 1);
		    data1[i][2]=ele.getData( i, 2);
			
		}
		
		return data1;
		
	}
}
