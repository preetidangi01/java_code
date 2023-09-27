import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{//!1/2+!2/3+!3/4+!4/5+!5/6=27.46666
		double n=5,i=1,sum=0,div=0,fact=1;
		do
		{
			fact*=i;
			div=fact/(i+1);
			sum+=div;
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
