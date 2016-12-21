package programs;

import java.io.*;
public class BufferRead 
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader objref=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the id");
		String rid=objref.readLine();
		
		//Integer i1=new Integer(read);
		
		
		System.out.println("enter the name");
		String name=objref.readLine();
		
		System.out.println("enter the salary");
		String rsal=objref.readLine();
		
		double sal= Double.parseDouble(rsal);
		System.out.println("id="+rid);
		System.out.println("name="+name);
		System.out.println("salary="+sal);
		
		
		
		
	}

}
