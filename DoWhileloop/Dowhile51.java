import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//(x^1/1)+(x^2/2)-(x^3/3)+(x^4/4)-(x^5/5)=-5.0666
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double i=1,n=5,div=0,sum=0,result=1;
		do
		{
			result*=x;
			div=result/i;
			if(i%2==0)
			{
				sum+=div;
			}else
			{
				sum-=div;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
