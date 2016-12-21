package programs;
import java.util.Scanner;

public class Swap 
{
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        int A, B, temp;
	        System.out.print("Enter an integer value for A: ");
	        A = input.nextInt();
	        System.out.print("Enter an integer value for  B: ");
	        B = input.nextInt();
	        System.out.println("Before: A = " + A + "   B = " + B);
	      
	        temp = A+B;
	        A = B-A;
	        B = temp;
	       
	        System.out.println("After: A = " + A + "   B = " + B);
	    }
	}


