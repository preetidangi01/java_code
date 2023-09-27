import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//(1/x^1)+(2/x^2)+(3/x^3)+(4/x^4)+(5/x^5)=1.78125
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double i=1,n=5,div=0,sum=0,result=1;
		do
		{
			result*=x;
			div=i/result;
			sum+=div;
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
