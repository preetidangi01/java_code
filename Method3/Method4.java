import java.util.Scanner;
class Division
{
	public double div()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		double a=sc.nextDouble();
		System.out.println("Enter value of b :");
		double b=sc.nextDouble();
		double div=a/b;
		return div;
	}
	public static void main(String args[])
	{
		Division ob=new Division();
		double div=ob.div();
		System.out.println("Division ="+div);
	}
}