import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//to print the reverse order of the input number
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int sum=0;
	int a =0;
	do
	{
		int r=n%10;
		a=a*10+r;
		n=n/10;
	}
	while(n>0);
		System.out.println(a);
	}
}
