import java.util.Scanner;
class Addition2
{
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition ="+sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Addition ob=new Addition();
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		Addition2.add(a,b);
	}
}