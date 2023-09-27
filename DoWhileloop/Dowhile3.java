import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//to print table of entered number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int i=1;
		int pro=1;
		do
		{
			pro=n*i;
			i++;
			System.out.println(n+"*"+i+"="+pro);
		}while(i<=10);
	}
}
