import java.util.Scanner;
import java.lang.Math;
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number :");
	int a=sc.nextInt();
	System.out.println("Enter minimum :");
	int b=sc.nextInt();
		
	System.out.println("\nminimum is"+Math.min(a,b));
	}
}