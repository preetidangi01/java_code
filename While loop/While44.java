import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//PRIME NUMBER PATTERN 3
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int flag=1;
		int i=2;
		while(i<n)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
			i++;
		}
		if(flag==1)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}
}
