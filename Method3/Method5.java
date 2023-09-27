import java.util.Scanner;
class Addition
{
	public int add()
	{
		int x=22, y=44;
		return x+y;
	}
	public static void main(String args[])
	{
		Addition ob=new Addition();
		System.out.println("Addition of 22&44 ="+ob.add());
	}
}
