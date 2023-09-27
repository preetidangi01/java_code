//!2+!4+!6=746
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number :");
	int n=sc.nextInt();
	int fact=1,sum=0,n1=2;
	for(int i=1;i<=n;i++)
	{
		fact=1;
		for(int j=1;j<=n1;j++)
		{
			fact=fact*j;
		}
		sum=sum+fact;
		System.out.print(n1+"!");
		if(i<n)
		{
			System.out.print("+");
		}
		n1=n1+2;
	}
		System.out.print(" = "+sum);
	}
}