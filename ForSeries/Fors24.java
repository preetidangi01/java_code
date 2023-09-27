import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , -(3^2/2)+(3^4/4)-(3^6/6)=-105.75
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double pow=1,sum=0,div=0,i=1,x=2;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n;
				div=pow/x;
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