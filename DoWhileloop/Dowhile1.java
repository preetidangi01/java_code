import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{//to print the sum pf first n numbers
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int i=1,sum=0;
		do
		{
			sum=sum+i;
			//System.out.println(i);
			i++;
		}
		while(i<=n);
			System.out.println(sum+" ");
		
	}
}
