import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{//-1/!1 + 3/!2 - 5/!3 + 7/!4 - 9/!5=-0.11666666
	double n=5;
	double i=1;
	double fact=1;
	double sum=0;
	double j=0;
	do
	{
		if(i%2==0)
		{
		fact =fact*i;
		j=(i*2-1)/fact;
		sum=sum+j;
		i++;
		}
		else
		{
		fact =fact*i;
		j=(i*2-1)/fact;
		sum=sum-j;
		i++;
		}
	}
	while(i<=n);
		System.out.println(sum);
	}
}  
