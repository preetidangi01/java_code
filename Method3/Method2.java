import java.util.Scanner;
class Subtraction
{
	public int sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int sub=a-b;
		return sub;
	}
	public static void main(String args[])
	{
		Subtraction ob=new Subtraction();
		int sub=ob.sub();
		System.out.println("Subtraction ="+sub);
	}
}