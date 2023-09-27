import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//tp check the number is armstrong or not
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int m=n;
		int count=0,sum=0;
		{
			count++;
			n=n/10;
		}
		while(n>0);//for checking digit count
		n=m;
		do
		{
			int r=n%10;
			int i=1;
			int pow=1;
				do{
					pow*=r;
					i++;
				  }
				while(i<=count);
			sum=sum+pow;
			n=n/10;
		}
		while(n>0);
		if(sum==m)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
	}
}
