//Case 2: All Method are non - static define with same class 
import java.util.Scanner;
class Test
{
	public static void display()
	{
		System.out.println("Hello display....");
	}
	public static void main(String args[])
	{
		
	}
	public void show()
	{
		System.out.println("Hello show.......");
	}
	static 
	{
		System.out.println("Hello static block...");
		Test.display();
		new Test().show();
	}
}
