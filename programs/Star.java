package programs;

public class Star
{

public static void main(String[]args)
{
	int rc=3,spacecounter=3,starcounter=1;
	
	for(int i=1;i<=rc;i++)
	{	
       System.out.println();
	for(int j=1;j<=spacecounter;j++)
		{
		   System.out.print(" ");
		}
	for(int k=1;k<=starcounter;k++)
	{
			System.out.print("* ");
	}
	spacecounter--;
	starcounter=starcounter+1;

	}


int r=2,spacecount=2,starcount=2;

for(int i=1;i<=r;i++)
{	
   System.out.println();
for(int j=1;j<=spacecount;j++)
	{
	   System.out.print(" ");
	}
for(int k=1;k<=starcount;k++)
{
		System.out.print("* ");
}
spacecount++;
starcount=starcount-1;


}
}
}


