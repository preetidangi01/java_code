import java.util.Scanner;
class Division
{
	public double div(double a,double b)
	{
		return a/b;
	}
	public static void main(String args[])
	{
		Division ob =new Division();
		double div=ob.div(10,4);
		System.out.println("Division ="+div);
	}
}