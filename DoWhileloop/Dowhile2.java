import java.util.Scanner;
class Increase
{
	public static void main(String args[])
	{//to print the series with increasing common difference by 1 ex, 1 2 4 7 11 16 22
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int i=1;
		int a=1;
			System.out.print(a+" ");
		do
		{
			a=a+i;
			i++;
			System.out.print(a+" ");
		}
		while(i<=n);
	}
}
