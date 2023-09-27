import java.util.Scanner;
class Subtraction
{
	public void Sub( int a,int b)
	{
		int sub=a-b;
		System.out.println("subtraction ="+sub);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Subtraction ob=new Subtraction();
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		ob.Sub(a,b);
	}
}