package programs;

public class Constructor
{
		
		Constructor()
		{
			this(5);
		System.out.println("Default constructor");	
		}
	Constructor(int i)
	{
		
		
		System.out.println("one argument constructor" +i);
		
	}
	public Constructor(int i,int j)
	{
	this();
		
		System.out.println("two argument constructor"+(i+j));
	}
	public static void main(String[] args)
	{
		Constructor r=new Constructor(4,4);
	}
	}



