import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//n=20, this is the programm to print the series of prime number upto n number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int i;
		for(i=2;i<=n;i++)
		{
			boolean prime=true;
			int j=2;
			for( j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime=false;
					break;
				}
			}
			if(prime)
			{
				System.out.println(i+" ");
			}
		}
	}
}
