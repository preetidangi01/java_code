import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , (2/3^2)-(4/3^4)+(6/3^6)=-0.18106
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		double pow=1,sum=0,div=0,i=1,x=2;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n;
				div=x/pow;
			}
			if(i%2==0)
				sum+=div;
			else
				sum-=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}