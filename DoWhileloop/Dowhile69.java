import java.util.Scanner;
class Test
{//-(x^1/!1)+(x^2/!2)-(x^3/!3)+(x^4/!4)-(x^5/!5)=-0.93333333
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
		do
		{
			if(i%2==0)
			{
			fact=fact*i;
			result*=x;
			div=result/fact;
			 sum=sum+div;
			}
			else
			{
			fact=fact*i;
			result*=x;
			div=result/fact;
			 sum=sum-div;
			}
			i++;
			
		}
		while(i<=n);
		System.out.println(sum);
	}
}
