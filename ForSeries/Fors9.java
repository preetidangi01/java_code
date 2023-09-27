import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//-(2/!2)+(4/!4)-(6/!6)=-0.84166666
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double fact=1,sum=0,div=0,i=1,x=2;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				div=x/fact;
			}
			if(i%2==0)
			{
			sum+=div;
			}else
			{
				sum-=div;
			}
			x+=2;
		}
		
		System.out.println(sum);
	}
}