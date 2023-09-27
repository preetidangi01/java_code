import java.util.Scanner;
class Test
{//(2/x^1)-(3/x^2)+(4/x^3)-(5/x^4)+(6/x^5)=0.625
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
		while(i<=n)
		{
			if(i%2==0)
			{
			result*=x;
			div=(i+1)/result;
			 sum=sum-div;
			}
			else
			{
				result*=x;
			div=(i+1)/result;
			 sum=sum+div;
			}
			i++;
		}
		System.out.println(sum);
	}
}
