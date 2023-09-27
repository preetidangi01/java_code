import java.util.Scanner;
class Addition
{
	public int add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		Addition ob=new Addition();
		int sum= ob.add();
		System.out.print("Addition ="+sum);
	}
}