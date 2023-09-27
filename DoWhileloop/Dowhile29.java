import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{//2/!1 + 4/!2 + 6/!3 +8/!4 + 10/!5=5.413
		double n=5;
		double i=1;
		double sum=0;
		double div=0;
		double fact=1;
		do
		{
			fact*=i;
			div=(i*2)/fact;
			sum+=div;
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
