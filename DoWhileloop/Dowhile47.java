import java.util.Scanner;
class Test

{
	public static void main(String args[])
	{//x^1 -x^2 +x^3 + x^4 - x^5 =22
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int x=sc.nextInt();
		int n=5,result=1,sum=0,i=1;
		do
		{
			if(i%2==0)
			{
			result*=x;
			sum-=result;
			}
			else
			{
				result*=x;
				sum+=result;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}
