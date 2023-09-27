import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//print this seires : !1+!2+!3+!4+!5=153
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int i=1;
		int fact=1;
		int sum=0;
		do
		{
			fact*=i;
			i++;
			sum+=fact;
		}
		while(i<=n);
		System.out.println("Sum"+sum);
	}
}
