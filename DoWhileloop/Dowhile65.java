import java.util.Scanner;
class Test
{//(1/x^1)-(3/x^2)+(5/x^3)-(7/x^4)+(9/x^5)=0.21875
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int x =sc.nextInt();
		int n = 5;
		double i=1;
		double sum=0;
		double div=0;
		double result=1;
		do
		{
			if(i%2==0)
			{
			result*=x;
			div=(i*2-1)/result;
			 sum=sum-div;
			}
			else
			{
				result*=x;
			div=(i*2-1)/result;
			 sum=sum+div;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
