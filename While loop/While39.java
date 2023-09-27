import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//This program  is to print the reverse the order of given number and store it any variable
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
	}
}
