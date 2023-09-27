import java.util.Scanner;
class TintValue
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition of two integer :");
		System.out.println("Enter 1st value of a :");		
		int a=sc.nextInt();
		System.out.println("Enter 2nd value of b :");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of "+a+" & "+b+" ="+c);
		
	}
}