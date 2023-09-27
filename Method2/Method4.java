import java.util.Scanner;
class Division
{
	public void div(double a,double b)
	{
		double  div=a/b;
		System.out.println("division ="+div);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Division ob=new Division();
		System.out.println("Enter value of a :");
		double a=sc.nextDouble();
		System.out.println("Enter value of b :");
		double b=sc.nextDouble();
		ob.div(a,b);
		
	}
}