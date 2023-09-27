import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{// -!1/2 + !2/4 -!3/6 +!4/8 -!5/10=-0.75000000
		double n=5;
		double i=1;
		double sum=0;
		double div=0;
		double fact=1;
		do{
			if(i%2==0)
			{
				fact*=i;
				div=(i*2)/fact;
				sum+=div;
			}
			else
			{
				fact*=i;
				div=(i*2)/fact;
				sum-=div;
			}
			i++;
		  }
		while(i<=n);
		System.out.println(sum);
	}
}
