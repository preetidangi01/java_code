import java.util.Scanner;
class Test
{//x^1+x^2+x^3+x^4+x^5=62
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int x =sc.nextInt();
		int n = 5;
		int i=0;
		int sum=0;
		int result=1;
		while(i<n)
		{
			result*=x;
			i++;
			 sum=result+sum;
		}
		System.out.println(sum);
	}
}
