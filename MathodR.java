import java.util.Scanner;
class Test
{
	public void add()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Addition ="+sum);
		
	}
	public static void main(String args[])//1st of all compiler main method pr jayga
	{
		Test //object refrance ob=new Test();//making object
		ob.add();//calling
	}
}