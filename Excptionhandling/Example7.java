package Excptionhandling;

import programs.ram;




public class Example7 
{
	class A
	{
		int i,j;
	}
		
	int j;
	int i[]=new int[2];
	A a;
	public void functionone()//throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException
	
	{
		//j=1/i[0];
		//i[2]=5;
		a.i=j;
		
	}
public static void main(String[]args)
{
	Example7 e=new Example7();
	try
	{
		e.functionone();
	}
	catch( ArithmeticException e1)
	{
		System.out.println("this is a value with is devided by 1");
	}
	catch(NullPointerException e1)
	{
		System.out.println("object selection is not done");
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.out.println("Array size limit is 2");
	}
	
	}
}

