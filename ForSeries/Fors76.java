import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n =3 ,(1/!2)+(3/!4)+(5/!6)=0.6319
		Scanner sc=new Scanner(System.in);
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
			div=k/fact;
			}
			sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}