import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//	if n=3 , (!1/3^2)-(!3/3^4)+(!5/3^6)=0.201645
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter turm number");
		int n=sc.nextInt();
		System.out.println("Enter power of any number");
		int m=sc.nextInt();
		int i,x=2,j,k=1;
		double pow=1,sum=0,div,fact;
		for(i=1;i<=n;i++)
		{
			fact=1;
			pow=1;
			for(j=1;j<=x;j++)
			{
				pow*=m;
			}
			for(j=1;j<=k;j++)
			{
				fact*=j;
			}
			div=fact/pow;
			if(i%2==0)
				sum-=div;
			else
				sum+=div;
		
			x+=2;
			k+=2;
		}
		System.out.println(sum);
	}
}