import java.util.Scanner;
class Test
{
	public void display()
	{
		System.out.println("Hello display");
	}
	public static void main(String args[])
	{
		Test ob=new Test();
		System.out.println("Hello main");
		ob.display();
		System.out.println("Hello main");
		
	}
}