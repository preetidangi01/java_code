import java.util.Scanner;
class Multiplication
{
	public void mult()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int mult=a*b;
		System.out.println("multiplication of elements="+mult);
	}
	public static void main(String args[])
	{
		Multiplication ob=new Multiplication();
		ob.mult();
	}
}