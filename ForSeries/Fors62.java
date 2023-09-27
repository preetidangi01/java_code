import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n =3 ,(1/!1)+(2/!3)+(3/!5)=70.5
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int i,j,x=1;
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
			sum=sum-div;
			}
			else
			{
			sum=sum+div;
			}
			x+=2;
			
		}
		System.out.println(sum);
	}
}