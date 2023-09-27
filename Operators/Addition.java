/* class Test
{
	public static void main(String args[])
	{
		int a=2,b=3;
		
		System.out.println("A="+a);
		System.out.println("B="+b);
		
		int sum=a+b;
		System.out.println("Addition ="+sum);
		
	}
}  */

import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a=sc.nextInt();
		System.out.println("Enter the Number :");
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("Addition ="+sum);
	}
}