import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//Fibonacci Series
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n =sc.nextInt();
		//int ft=0;
		int ft=-1;
		int st=1;
		int i=1;
		do
		{

            		int nt =ft+st;
			System.out.println(nt +" ");
       	     	ft = st;
            		st= nt;
			i++;
		}
		while(i<=n);
	}
}

