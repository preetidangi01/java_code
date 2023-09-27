import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int i,j,k;
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				for(k=1;k<=10;k++)
				{	
				System.out.println(i+" "+j+" "+k);
				if(k>=1)
				break;
				if(j>=2)
				break;
				if(i>=3)
				break;
				}
				
			}
			
			
		}
	}
}