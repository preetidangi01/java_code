import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your Age :");
		int n=sc.nextInt();
		
		if(n<=12)
				System.out.println("you are child   :");
			
			else if(n<=20)
				System.out.println("you are Tenager :");
			
			else if(n<=45)
				System.out.println("you are adult   :");
			
			else
				System.out.println("you are senoir  :");
	}
}