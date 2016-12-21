package Designpatterans;

public class Singleton 
{
	private static Singleton singleobj=new Singleton();
	private Singleton()
	{
		System.out.println("defaultconst");
	}
	public static Singleton  getinstance()
	{
		return singleobj;
	}
	public void display()
	{
		System.out.println("this is a class");
	
		
	}
	static class Test
	{
	
	public static void main(String[] args)
	{
Singleton.getinstance().display();
	}

}
}