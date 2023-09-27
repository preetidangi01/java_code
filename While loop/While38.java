import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=18852,i=1;
	int sum=0;
	while(n>0)
	{
	 int r=n%10;
	 System.out.println("r="+r);
	 sum=sum+r;
	 n=n/10; 
	 i++;
	}
	System.out.println(sum);
	}
}
