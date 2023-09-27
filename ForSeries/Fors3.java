// -!2+!4-!6=-698
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int fact=1,sum=0,x=2;
		for(int i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact=fact*j;
			}
			if(i%2==0)
			{
				sum=sum+fact;
				System.out.print(" + "+x+" ! ");
			}
			else
			{
				sum=sum-fact;
				if(i>1)
				System.out.print("-");
				System.out.print(x+" ! ");
			}
			        x=x+2;
		}
		System.out.println("="+sum);
		
	}
}