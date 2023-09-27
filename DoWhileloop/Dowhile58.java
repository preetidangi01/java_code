import java.util.Scanner;
class Test
{//(2/x^1)+(3/x^2)+(4/x^3)+(5/x^4)+(6/x^5)=2.75
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
			result*=x;
			div=(i+1)/result;
			 sum=div+sum;
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
