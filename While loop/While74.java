import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//tp check the number is armstrong or not
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int m=n;
		int count=0,sum=0;
		while(n>0)//for checking digit count
		{
			count++;
			n=n/10;
		}
		n=m;
		while(n>0)
		{
			int r=n%10;
			int i=1;
			int pow=1;
			while(i<=count)
			{
				pow*=r;
				i++;
			}
			sum=sum+pow;
			n=n/10;
		}
		if(sum==m)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}
}
