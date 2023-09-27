import java.util.Scanner;
class S69
{
	public static void main(String args[])
	{//if n=3, (3^2/1)+(3^4/2)-(3^6/3)=-211.5
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int i,j,x=2;
		double pow,sum=0,div=0;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(j=1;j<=x;j++)
			{
				pow=pow*n;
			    div=pow/i;
			}
			if(i%2==0)
			{
			sum=sum+div;
			}
			else
			{
			sum=sum-div;
			}
			x+=2;
			
		}
		System.out.println(sum);
	}
}