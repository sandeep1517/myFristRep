package TestngFristDemo;

import org.testng.annotations.Test;

public class FristTestNgProgram 
{
    
	@Test(priority=1 )
    public void test()
	{
		
		System.out.println("Hi world");
	}
	@Test(priority=2)
	public void test1()
	{
		
		System.out.println("I am Coming Back");
	}
	@Test(priority=3)
	public void test2()
	{
		
		System.out.println("Changing the World");
	}
	
	
}
