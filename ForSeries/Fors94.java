import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 ,(3^1/4)+(3^3/6)+(3^5/8)=32.62
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double pow=1,k,sum=0,div=0,i=1,x=1;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n;
				k=x+3;
				div=pow/k;
			}
				sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}