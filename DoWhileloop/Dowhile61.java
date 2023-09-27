import java.util.Scanner;
class Test
{//(x^1/1)+(x^2/3)+(x^3/5)+(x^4/7)+(x^5/9)=10.77
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
			div=result/(i*2-1);
			 sum=div+sum;
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
