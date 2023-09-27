import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n=3 , 3^2-3^4+3^6=657
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int pow=1,sum=0,x=2;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n;
			}
			if(i%2==0)
				sum=sum-pow;
			else
				sum=sum+pow;
			x+=2;
		}
		
		System.out.println(sum);
	}
}