import java.util.Scanner;
class Subtract
{
	public void sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		int sub
		=a-b;
		System.out.println("subtract of "+a+" & "+b+" ="+sub);
	}
	public static void main(String args[])
	{
		Subtract ob=new Subtract();
		ob.sub();
	}
	
}
