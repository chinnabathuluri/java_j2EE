package Serialization;

import java.util.Scanner;

public class Emp2
{
static int eid;
static String ename;
static String esalary;
static double eloan;
public void empdetails(int eid,String ename,String esalary2,double eloan)

{
	Scanner sc= new Scanner(System.in);

	System.out.println("ENTER THE NO OF EMPLOYEES");
	Scanner input;
	int length=sc.nextInt();
for(int i=0;i<length;i++)
{
	
	System.out.printf("Please enter your employee eid:");
	int e = sc.nextInt();

	System.out.printf("Please enter your employee ename:");
	String st1 = sc.next();

	System.out.printf("Please enter your esalary:");
	double s= sc.nextInt();
	System.out.printf("Please enter your eloan:");
double st11= sc.nextDouble();
	
}
}

/*private void deleteEmployee()             //delete 
{

	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the first name of the employee you want to delete from the list")
	  String name = scan.nextLine();

	  for (int i = 0; i < Emp2.length; i++)
	  {
	      
		if (Emp2[i] != null && Emp2[i].getFirstName().equals(name))
		{
	           Emp2[i] = null;
	         break; 
	       }

	       if (i == Emp2.length - 1)
	       {
	           System.out.println("That requested person is not employed at this firm.");
	  
	}*/


public static void main(String[]args)
{
	Emp2 ee=new Emp2();
	Scanner sc= new Scanner(System.in);
	System.out.println("=================================");
System.out.println("SELECT ON CHOICE");
System.out.println("===============================");
System.out.println("ENTER THE DTAILS OF EMPLOYEE:");

System.out.println("1.INSERTING ON EMPLOYEE DETAILS");
System.out.println("2.DELETING ON EMPLOYEE DETAILS");
System.out.println("3.UPDATING ON EMPLOYEE DETAILS");
System.out.println("4.EXIT");


System.out.println("ENTER YOUR CHOICE");
String st=sc.nextLine();
ee.empdetails(eid, ename, esalary, eloan);





}
	
	
}

