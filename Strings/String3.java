package Strings;

import java.util.Scanner;

public class String3 
{
	public static void main(String args[])
	{
		/*Scanner Sc =new Scanner(System.in);   // [1]printing length of string
		System.out.println("Enter a String value=");
		String Str=Sc.next();
		System.out.println(Str.length());*/
		
		
		
		
	/*	String str="my name is khan my name is java";  
		String replaceString=str.replace("is","was");//[2]replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);  */
		  
		
		
	/*	Scanner Sc =new Scanner(System.in);   //[3]printing codePointbefore
		System.out.println("Enter a String value=");
		String Str=Sc.next();
		int value=Str.codePointBefore(2);
		System.out.println(value);*/
		
		
		
		/*String s1="my name";    //[4]concat 
		s1.concat("is Ramudu");  
		System.out.println(s1);  
		s1=s1.concat(" is immutable is ramudu");  
		System.out.println(s1);  */
		 
		
		/*String str1 = "Strings are immutable";     //[5]compareTo
	      String str2 = new String("Strings are immutable");
	      String str3 = new String("Integers are not immutable");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println(result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println(result);*/
		
		
		
		
		
		
		
		     /* String str1 = "Strings are immutable";        //[6]compareToIgnore
		      String str2 = "Strings are immutable";
		      String str3 = "Integers are not immutable";

		      int result = str1.compareToIgnoreCase( str2 );
		      System.out.println(result);

		      result = str2.compareToIgnoreCase( str3 );
		      System.out.println(result);

		      result = str3.compareToIgnoreCase( str1 );
		      System.out.println(result);*/
		
		
		
		
		/*char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'}; //[7]copyvalueof
	      String Str2 = "";
	      Str2 = Str2.copyValueOf( Str1 );
	      System.out.println("Returned String: " + Str2);*/
		
		
		 
		/*	String s1="this is index of example";  //[8]indexof
			//passing substring  
			int index1=s1.indexOf("is");//returns the index of is substring  
			int index2=s1.indexOf("index");//returns the index of index substring  
			System.out.println(index1+"  "+index2);//2 8  
			    
			int index3=s1.indexOf("is",4);  
			System.out.println(index3); 
			  
	  
			int index4=s1.indexOf('s'); 
			System.out.println(index4);  */
		
		
		
		/*String s1="  hello string   ";  //[9]Trim
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim()  */
		
		
	/*	String st="dhatriifosolutions";   //[10]toUpper and Lower class
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st);   */
		
		
		
	/*	String s="Hyderabad is a greencity";         //[11]startswith and endswith
		System.out.println(s.startsWith("Hydera"));
		System.out.println(s.endsWith("123"));*/
	
		
		
		
	/*	String s1="java string split method by javatpoint";  //[12]split by string
		String[] words=s1.split("\\s"); 
		for(String w:words)
		{  
		System.out.println(w);  
		//System.out.println(s1);
		}*/
		
		
	/*	String name="what do you know about me";  //[13]contains
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
	
		System.out.println(name.contains("123")); */
		
		
		
		
	/*	String s1="javatpoint";  //[14]equalsIgnoreCase
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="12233";  
		System.out.println(s1.equalsIgnoreCase(s2));  
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4)); */
		
		
	/*	String s1="javatpoint";  //[15]substring
		System.out.println(s1.substring(2,5));
		System.out.println(s1.substring(2));  */
		
		
		
		
	/*	int value=30;            //[16]valueof
		String s1=String.valueOf(value);  
		System.out.println(s1+10);   */
		
		
		
		
	/*	String s1="this is index of example";  //[17]lastIndexOf
		int index1=s1.lastIndexOf('s'); 
		System.out.println(index1);  */
		
		
		
		
		
		
/*		String s1="ramudu is good boy";  //[18]repalceall
		String replaceString=s1.replaceAll("a","e"); 
		System.out.println(replaceString);  */
		
		
		
	/*	String s1="";   //[19]isempty
		String s2="javatpoint";  
		  
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());  */

		
		
		
		String s1=new String("hello");  //[20]intern
		String s2="hello";  
		String s3=s2.intern();  
		System.out.println(s1==s2); 
		System.out.println(s2==s3);
}


}		
		
	   
	   
		
		
	



	


