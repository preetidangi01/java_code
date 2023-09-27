import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//(2/!2)+(4/!4)+(6/!6)=1
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double fact=1,sum=0,i=1,x=2,div=0;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				div=x/fact;
			}
			sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}