import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//(1/!1)-(3/!3)+(5/!5)=0.5416666
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		double fact=1,sum=0,div=0,x=1;
		for(int i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact=fact*j;
				div=x/fact;
			}
			if(i%2==0)
			{
			sum=sum-div;
			}else
			{
				sum=sum+div;
			}
			x=x+2;
		}
		
		System.out.println(sum);
	}
}