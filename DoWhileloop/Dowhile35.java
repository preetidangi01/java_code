import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{// 1/!1 + 3/!2 + 5/!3 + 7/!4 + 9/!5=3.7
	double n=5;
	double i=1;
	double fact=1;
	double sum=0;
	double j=0;
	do
	{		
		fact =fact*i;
		j=(i*2-1)/fact;
		sum=sum+j;
		i++;
	}
	while(i<=n);
		System.out.println(sum);
	}
}  
