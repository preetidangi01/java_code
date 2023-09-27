import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n =3 ,(1/!1)+(2/!3)+(3/!5)=1.35833
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int i,j,x=1;
		double fact,sum=0,div=0;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(j=1;j<=x;j++)
			{
				fact=fact*j;
			    div=i/fact;
			
			}
			sum=sum+div;
			x+=2;
			
		}
		System.out.println(sum);
	}
}