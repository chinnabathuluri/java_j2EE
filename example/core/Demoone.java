package example.core;

public class Demoone {
	//int i,j;
	private int x;
	static float f1,f2;
	static boolean flag;
	
		public float functionone(float f1,float f2)
		{
		
		Demoone.f1=f1+f2;
		Demoone.f2=Demoone.f1+f2;
		return Demoone.f2+f1;
		}
		public int functionone(float f1)
		{
			Demoone.f1=f1+f2;
			f1=Demoone.f1+f1;
			return(int)f1;
		}
		public static Demoone functionone(int x)
		{
			Demoone done=new Demoone();
			done.x=done.functionone(x+1.0f);
			f1=done.functionone((float)x, f1);
			return done;
					
			
			
		}
	

	}


