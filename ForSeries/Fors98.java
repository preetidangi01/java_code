import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , ,(4/3^1)-(6/3^3)+(8/3^9)=1.44032
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
				div=k/pow;
			}if(i%2==0)
				sum-=div;
			else
				sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}