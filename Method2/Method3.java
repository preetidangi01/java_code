import java.util.Scanner;
class Multiplication
{
	public void Mult( int a,int b)
	{
		int mult=a*b;
		System.out.println("Multiplication ="+mult);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Multiplication ob=new Multiplication();
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		ob.Mult(a,b);
	}
}