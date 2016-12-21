package Excptionhandling;

public class Ecep1
{
	public static void main(String[]args)
	{
	/*	System.out.println("hello world");
		System.out.println(10/0); //ae
		System.out.println("ramudu");
		System.out.println("ramudu");
		System.out.println("rest of th code executed");*/
		
		
		
		
		System.out.println("hello world");
		System.out.println("ramudu");
		try
		{
			Thread.sleep(300);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
