import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//programm to print x to the power y
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int x =sc.nextInt();
		System.out.println("Enter power value");
		int n =sc.nextInt();
		int i=0;
		int result=1;
		while(i<n)
		{
			result*=x;
			i++;
		}
		System.out.println(result);
	}
}
