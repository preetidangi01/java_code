//!2/2+!4/4+!6/6=127
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number :");
	int n=sc.nextInt();
	int fact=1,sum=0,x=2,div=0;
	for(int i=1;i<=n;i++)
	{
		fact=1;
		for(int j=1;j<=x;j++)
		{
			fact=fact*j;
		}
		sum=sum+fact/x;
		System.out.print(x+"!/"+x);
		if(i<n)
		{
			System.out.print("+");
		}
			x=x+2;
	}
		System.out.print(" = "+sum);
	}
}