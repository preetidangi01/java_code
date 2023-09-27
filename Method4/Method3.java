import java.util.Scanner;
class Multiplication
{
	public int mult(int a, int b)
	{
		return a*b;
	}
	public static void main(String args[])
	{
		Multiplication ob =new Multiplication();
		int mult=ob.mult(8,8);
		System.out.println("Multiplication ="+mult);
		
	}
}