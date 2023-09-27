// 4. Returntype with argument Method 
import java.util.Scanner;
class Addition
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		//int sum=new Addition().add(9,4);
		Addition ob =new Addition();
		int sum=ob.add(12,32);
		System.out.println("Result ="+sum);
	}
}