import java.util.Scanner;
class Test
{//(!1/X^1)-(!2/X^2)+(!3/X^3)-(!4/X^4)+(!5/X^5)=-3
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int x =sc.nextInt();
		int n = 5;
		double i=1;
		double sum=0;
		double div=0;
		double result=1;
		double fact=1;
		do
		{
			if(i%2==0)
			{
			fact=fact*i;
			result*=x;
			div=fact/result;
			 sum=sum+div;
			}
			else
			{
			fact=fact*i;
			result*=x;
			div=fact/result;
			 sum=sum-div;
			}
			i++;
			
		}
		while(i<=n);
		System.out.println(sum);
	}
}
