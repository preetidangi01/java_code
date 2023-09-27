import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{// !1/1 - !2/3 + !3/5 - !4/7 + !5/9=11.45
	double n=5;
	double i=1;
	double sum=0;
	double div=0;
	double fact=1;
	do
	{
		if(i%2==0)
		{
			fact*=i;
			div=fact/(i*2-1);
			sum-=div;
		}
		else
		{
			fact*=i;
			div=fact/(i*2-1);
			sum+=div;
		}
			i++;
	}
	while(i<=n);
		System.out.println(sum);
	}
}
