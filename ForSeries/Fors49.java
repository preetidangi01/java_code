import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n =3 ,(!2/1)+(!4/2)+(!6/3)=254.0
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		double fact=1,sum=0,i=1,x=2,div=0;
		for(i=1;i<=n;i++)
		{
			
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				div=fact/i;
			}
			sum+=div;
			x+=2;
		}
		
		System.out.println(sum);
	}
}