import java.util.Scanner;
class Test
{//-(1/x^1)+(2/x^2)-(3/x^3)+(4/x^4)-(5/x^5)=-0.281
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
			div=i/result;
			 sum=sum+div;
			}
			else
			{
				result*=x;
			div=i/result;
			 sum=sum-div;
			}
			i++;
		}
		System.out.println(sum);
	}
}
