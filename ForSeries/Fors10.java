import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//!1+!3+!5=127
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int fact=1,sum=0,i=1,x=1;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			sum+=fact;
			x+=2;
		}
		
		System.out.println(sum);
	}
}