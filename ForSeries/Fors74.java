import java.util.Scanner;
class S74
{
	public static void main(String args[])
	{//if n =3 ,(!2/1)-(!4/3)+(!6/5)=138
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		double fact=1,pow=1,sum=0,i=1,div=0;
		
		int x=2,k;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				k=x-1;
			div=fact/k;
			}
			if(i%2==0)
			sum-=div;
				else
				sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}