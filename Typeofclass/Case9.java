import java.util.Scanner;
class Modulues
{
	private double a,b;
	public void setData(double a, double b)
	{
		this.a=a;
		this.b=b;
	}
	public double getData()
	{
		double c=this.a%this.b;
		return c;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		double a=sc.nextDouble();
		System.out.println("Enter value of b :");
		double b=sc.nextDouble();
		Modulues ob=new Modulues();
		ob.setData(a,b);
		double c=ob.getData();
		System.out.println("Modulues="+c);
	}
}
