package Innerclass;

public class Outer {
	int x,y;
	static float f1,f2;
	public int functionone(int x,int y)
	{
		this.x=x+y;
		this.y=x*y;
		return this.x+this.y;
	}
	class inner
	{
		int x;
		public float functiontwo(int x)
		{
			this.x=x+functionone(2,3);
			f1=this.x;
			f2=f1+1.0f;
			return f1+f2;
		
		}
	}

	public static void main(String[]args)
	{
		Outer o=new Outer();
		Outer.inner oi=o.new inner();
		float f1=oi.functiontwo(5);
		System.out.println(oi.x); 
		System.out.println(f1); 
		System.out.println(f2); 
		System.out.println(o.x); 
		System.out.println(o.y); 
	}
	
		
		
	}

