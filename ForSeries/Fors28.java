import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , 3^1+3^3+3^5=273
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int pow=1,sum=0,i=1,x=1;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n;
			}
			sum+=pow;
			x+=2;
		}
		
		System.out.println(sum);
	}
}