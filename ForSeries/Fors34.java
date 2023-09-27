import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , (1/3^1)+(3/3^3)+(5/3^5)=0.4650205
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double pow=1,sum=0,div=0,i=1,x=1;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n;
				div=x/pow;
			}
			sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}