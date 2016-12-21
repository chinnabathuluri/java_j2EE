package Strings;

public class PalinBuffer
{
public static void main(String[] args)
{
String str1= new String("malayalam");

StringBuffer str2= new StringBuffer(str1);

StringBuffer str3= new StringBuffer(str1);

str2.reverse();

System.out.println("Firstng:"+str2+" Length:"+str2.length());
System.out.println("Secondng:"+str3);
if (str2.equals(str3))
	
System.out.println("Was not palindrome");

else
	
System.out.println("Was a palindrome");
}
}


