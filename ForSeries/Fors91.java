import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , (4/!2)+(6/!4)+(8/!6)=2.26111
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double fact=1,k,sum=0,i=1,x=2,div=0;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				k=x+2;
				div=k/fact;
			}
			sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}