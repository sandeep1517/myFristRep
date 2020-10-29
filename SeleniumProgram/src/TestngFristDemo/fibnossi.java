package TestngFristDemo;

import java.util.Scanner;

public class fibnossi {

	public static void main(String[] args) 
	{
		System.out.println("enter num==");
		Scanner st=new Scanner(System.in);
	    int num=st.nextInt();	
		int a=0,b=1;
		
		System.out.print("fibonacci series :"+a);
		System.out.print(" "+b);
		int c;
		
	
		for(int i=1;i<=num;i++)
		{
			c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
			
		}
	}

}
