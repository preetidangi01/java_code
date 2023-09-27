import java.util.Scanner;
class Matrix4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter colomn of matrix 1 ");
		int c1=sc.nextInt();
		System.out.println("Enter row of matrix 1 ");
		int r1=sc.nextInt();
		System.out.println("Enter colomn of matrix 2 ");
		int c2=sc.nextInt();
		System.out.println("Enter row of matrix 2 ");
		int r2=sc.nextInt();
		
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int sum[][]=new int[5][5];
		if(r1==r2&&c1==c2)
		{
			System.out.print("Enter Matrix 1 : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.print("Enter matrix 2 :");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("Matrix 1 is");
			for(int i=0;i<r1;i++)
			{
				for( int j=0;j<c1;j++)
				{
					System.out.print("\t"+a[i][j]+" ");	
				}
				System.out.println("");
			}
			System.out.println("Matrix 2 is");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print\("\t"+b[i][j]+" ");
				}
					System.out.println("");
			}
			System.out.println("Sum of Matrix is");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print("\t"+sum[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
		else
			System.out.println("Enter valid matrix or sum size matrix");
	}
}