import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age :");
		int a=sc.nextInt();
		
		if(a<=0)
		{
			System.out.println("Age is invalid");
		}
		else if(a>=18)
		{
			System.out.println("you eligible for vote");
		}
		else
		{
			System.out.println("you are Balak");
		}
	}
}