import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//(!1/1)-(!3/3)+(!5/5)=23
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int fact=1,sum=0,div=0,i=1,x=1;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact=fact*j;
				div=fact/x;
			}
			if(i%2==0)
			{
			sum=sum-div;
			}else
			{
				sum=sum+div;
			}
			x=x+2;
		}
		
		System.out.println(sum);
	}
}