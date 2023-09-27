import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , (1/3^2)-(1/3^4)+(1/3^6)=79.875
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double pow=1,k,sum=0,div=0,i=1,x=2;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n;
				k=x+2;
				div=pow/k;
			}
			if(i%2==0)
			sum-=div;
				else
				sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}