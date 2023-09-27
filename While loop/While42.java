import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{//prime number pattern 1
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any numer :");
		int n =sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
			
		}
		if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("Not prime");
			
		
		
	}
}


