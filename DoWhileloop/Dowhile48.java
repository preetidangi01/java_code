import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//-x^1 +x^2 -x^3 + x^4 - x^5=-22 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int x =sc.nextInt();
		int n = 5;
		int i=1;
		int sum=0;
		int result=1;
		do{
			if(i%2==0)
			{
			result=result*x;
			 sum=sum+result;
			}
			else
			{
				result=result*x;
			 sum=sum-result;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
