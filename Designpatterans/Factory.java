package Designpatterans;

import java.util.Scanner;

interface Factory 
{
	public void draw();
}
		class rectangle implements Factory
		{
			public void draw()
			{
				System.out.println("this is rectangle");
				
			}
			
		}
	
		class traingle implements Factory
		{
			public void draw()
			{
				System.out.println("this is traingle");
			}
		}
		class Shapeimp
		{
			public static Factory getType(String draw)
			{
				if(draw==null)
				{
					return null;
					
				}
				else if(draw.equals("rectangle"))
				{
					return new rectangle();
				}
				else if(draw.equals("traingle"))
				{
					return new traingle();
				}
				return null;
				
			}	
		}
		
	public  class shape
		{
				
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.rectangle");
		System.out.println("2.traingle");
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:Factory s=Shapeimp.getType("rectangle");
		s.draw();
		break;
		
		
		case 2:Factory s1=Shapeimp.getType("rectangle");
		s1.draw();
		break;
		
		
		}

	}
		}

	
	


