import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{//!1/2 + !2/4 +!3/6 + !4/8 + !5/10=17.00
		double n=5;
		double i=1;
		double sum=0;
		double div=0;
		double fact=1;
		do{
			fact*=i;
			div=fact/(i*2);
			sum+=div;
			i++;
		}while(i<=n);
		System.out.println(sum);
	}
}
