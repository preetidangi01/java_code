import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//prime number pattern 2
	Scanner sc=new Scanner(System.in);
	System.out.print("enter any numer :");
	int n =sc.nextInt();
	int i=2;
	do
	{
		if(n%i==0)
		{
			break;
		}
			i++;
			
	}
	while(i<n);
		if(i==n)
			System.out.println("Prime number");
		else
			System.out.println("Not prime");
		
	}
}


