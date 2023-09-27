import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{//prime number pattern 2
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any numer :");
		int n =sc.nextInt();
		int i=2;
		while(i<n)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
			
		}
		if(i==n)
			System.out.println("Prime number");
		else
			System.out.println("Not prime");
			
		
		
	}
}


