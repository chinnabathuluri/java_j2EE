/*package Innerclass;

import Innerclass.Outer.inner;

public class Outer2 
{
	
		int x,y;
		static float f1,f2;
		public int functionone(int x,int y)
		{
			this.x=x+y;
			this.y=x*y;
			return this.x+this.y;
		}
		static class Inner
		{
			int x;
			Outer2 o=new Outer2();
			
			public float functiontwo(int x)
			{
				this.x=x+o.functionone(2,3);
				f1=this.x;
				f2=f1+1.0f;
				return f1+f2;
			
			}
			static float pi=3.14f;
		}

		public static void main(String[]args)
		{
			Outer2 o=new Outer2();
			Outer2.Inner oi=Outer2.new Inner();
			
			float f1=oi.functiontwo(5);
			System.out.println(oi.x); 
			System.out.println(f1); 
			System.out.println(f2); 
			System.out.println(o.x); 
			System.out.println(o.y); 
			//System.out.println(o.inner.pi);
			
		}
		
			
			
		}


*/
