import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{//This program  is to print the sum of all digits of entered number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int sum=0;
		do
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		while(n>0);
		System.out.println(sum);
	}
}
