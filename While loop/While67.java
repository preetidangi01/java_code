import java.util.Scanner;
class Test
{//(x^1/!1)+(x^2/!2)+(x^3/!3)+(x^4/!4)+(x^5/!5)=6.26666
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
		double fact=1;
		while(i<=n)
		{
			fact=fact*i;
			result*=x;
			div=result/fact;
			 sum=div+sum;
			i++;
		}
		System.out.println(sum);
	}
}
