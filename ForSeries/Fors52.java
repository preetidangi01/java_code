import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n =3 ,(1/!2)+(2/!4)+(3/!6)=
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int i,j,x=2;
		double fact,sum=0,div=0;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(j=1;j<=x;j++)
			{
				fact=fact*j;
			    div=fact/i;
			}
			sum=sum+div;
			x=x+2;
		}
		System.out.println(sum);
	}
}