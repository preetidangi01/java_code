import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//factorial of first n natural number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int i=1;
		int fact=1;
		do
		{
			fact*=i;
			i++;
		}
		while(i<=n);
		System.out.println(fact);
	}
}
