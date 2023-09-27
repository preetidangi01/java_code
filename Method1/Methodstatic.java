import java.util.Scanner;
class Addition
{
	public static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum of "+a+" & "+b+" ="+sum);
	}
	public static void main(String args[])
	{
		Addition.add();
	}
	
}
