import java.util.Scanner;
class Multiplication
{
	public int mult()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int mult=a*b;
		return mult;
	}
	public static void main(String args[])
	{
		Multiplication ob=new Multiplication();
		int mult=ob.mult();
		System.out.println("Multiplication ="+mult);
	}
}