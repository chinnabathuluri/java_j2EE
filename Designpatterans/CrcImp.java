package Designpatterans;

public class CrcImp {
	
	public  static rak getType(String str)
	{
		if(str.equals("opened"))
		{
			return new betcric();
		}
		else if(str.equals("closed"))
		{
			return new cricten();
			
		}
		else if(str.equals(""))
		{
			return new cricfive();
		}
		return null;
	}

}
