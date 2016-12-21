package Designpatterans;

import java.util.Scanner;

public class MainFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*CrcImp cr=new CrcImp();
		rak obj=cr.getType("");
		obj.cric();*/
		Scanner sc=new Scanner(System.in);
		System.out.println("1.closed 2.opened 3.nothing3");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:rak r=CrcImp.getType("closed");
		r.cric();
		break;
		case 2:rak r1=CrcImp.getType("opened");
		r1.cric();
		break;
		case 3:rak r3=CrcImp.getType("");
		r3.cric();
		break;


		}

	}

}
