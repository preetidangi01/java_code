import java.util.Scanner;
class Subtraction
{
	public int sub(int a,int b)
	{
		return a-b;
	}
	public static void main(String args[])
	{
		Subtraction ob =new Subtraction();
		int sub=ob.sub(9,4);
		System.out.println("Subtraction ="+sub);
	}	
}