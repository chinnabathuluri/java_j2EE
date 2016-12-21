package Strings;

import java.util.Scanner;



public class String2 
{
	public static void main(String args[])
	{
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter a String value=");
		String Str=Sc.next();
		char ch[]= new char[Str.length()];
		for(int i = 0;i<=Str.length()-1;i++)
		{
		//System.out.println(Str.charAt(2));
		
			System.out.println(Str.charAt(i));
			
			
			
			
		}
	}
}

	
	


