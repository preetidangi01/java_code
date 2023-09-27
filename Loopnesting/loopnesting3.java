import java.util.Scanner;
class For1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter any no.");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{	System.out.print(j+"  ");}
			System.out.println();
		}
			
	}
}