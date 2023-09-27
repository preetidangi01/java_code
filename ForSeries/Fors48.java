import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n =3 ,(!2/3^1)-(!4/3^3)+(!6/3^5)=2.740740
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double fact=1,pow=1,sum=0,i=1,x=1,div=0;
		for(i=1;i<=n;i++)
		{
			pow=1;
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n;
			div=fact/pow;
			}
			if(i%2==0)
			sum+=div;
			else
				sum-=div;
				
			x+=2;
		}
		
		System.out.println(sum);
	}
}