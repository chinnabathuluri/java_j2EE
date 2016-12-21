package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cricket2 
{
	int pcode,run,notout;
	String name;
	int iplayed;
	Cricket2()
	{ }

	Cricket2(int pcode1,String pname,int run1,int iplayed1,int notout1)throws IOException
	{
	pcode=pcode1;
	name=pname;
	run=run1;
	iplayed=iplayed1;
	notout=notout1;
	}

	public double average (String name1)
	{
	double avg=0;
	if(name.equals(name1))
	{
	avg=(double)run/(double)iplayed;
	return avg;
	}
	else
	return 0;
	}

	public double average ()
	{
	double avg=0;
	avg+=(double)run/(double)iplayed;
	return avg;
	}
	public static class Test
	{
	public static void main(String args[])throws IOException
	{
	int pcode,iplayed,noplayer,notout,runs;
	double avg=0,avgall=0;
	String name;
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter How many Players:=> ");
	noplayer=Integer.parseInt(br.readLine());
	Cricket2 s[]=new Cricket2[noplayer];

	for(int i=0;i<noplayer;i++)
	{
	System.out.println("Enter Player Code:=> ");
	pcode=Integer.parseInt(br.readLine());
	System.out.println("Enter Player Name:=> ");
	name=br.readLine();
	System.out.println("Enter Runs:=> ");
	runs=Integer.parseInt(br.readLine());
	System.out.println("Enter No of innings Played:=> ");
	iplayed=Integer.parseInt(br.readLine());
	System.out.println("Enter No of Times Not Out:=> ");
	notout=Integer.parseInt(br.readLine());
	s[i]=new Cricket2(pcode,name,runs,iplayed,notout);
	}

	for(int i=0;i<noplayer;i++)
	{
	avg+=s[i].average("Ram");
	}

	System.out.println("Average of Ram is :> "+avg);

	for(int i=0;i<noplayer;i++)
	{
	avgall=s[i].average();
	System.out.println("Average of "+s[i].name+"is :>"+avgall);
	}
	}
	}
}
