import java.util.Scanner;
class Test
{//(x^1/2)-(x^2/3)+(x^3/4)-(x^4/5)+(x^5/6)=3.8
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
			div=result/(i+1);
			 sum=sum-div;
			}
			else
			{
				result*=x;
			div=result/(i+1);
			 sum=sum+div;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
