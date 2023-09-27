import java.util.Scanner;
class MatrixLowerTriSum
//row major matrix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. colume");
		int c=sc.nextInt();
		int sum=0;
		System.out.println("Enter no. row");
		int r=sc.nextInt();
		int a[][]=new int[5][5];
		if(r==c)
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<=i;j++)
				{
						System.out.print("   "+a[i][j]+"   ");
						sum=sum+a[i][j];
				}
				System.out.println();
			}
			System.out.println("Sum of Diagonals Element is:-"+sum);
		}
		else
			System.out.println("Enter same no. of colume or row ");
	}
}