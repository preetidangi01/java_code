import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{//2/!1 + 3/!2 + 4/!3 + 5/!4 + 6/!5=4.425
		double n=5;
		double i=1;
		double sum=0;
		double div=0;
		double fact=1;
		do
		{
			fact*=i;
			div=(i+1)/fact;
			sum+=div;
			i++;
		}while(i<=n);
		System.out.println(sum);
		
	}
}
