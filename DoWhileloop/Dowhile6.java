import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//to print the square of first n natural number and their sum
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int i=1;
		int a=1;
		int sum=0;
		do
		{
			a=i*i;
			i++;
			System.out.print(a+" ");
			sum+=a;
		}
		while(i<=n);
		System.out.println("Sum"+sum);
	}
}
