import java.util.Scanner;
class Matrix3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix in colomn");
		int c=sc.nextInt();
		System.out.println("Matrix in row");
		int r=sc.nextInt();
		int j;
		int a[][]=new int[5][5];
		for(int i=0;i<r;i++)
		{
			for( j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println("");
		}
		System.out.println("Matrix elements are ");
		for(int i=0;i<r;i++)
		{
			for( j=0;j<c;j++)
			{
				System.out.print("\t"+a[i][j]+" ");
			}
			System.out.println("");
		}
		for(int i=0;i<r;i++)
		{
			for( j=i+1;j<c;j++)
			{
				int temp=a[j][i];
				a[i][j]=a[i][j];
				a[i][j]=temp;
			}
		}
		System.out.println("T Matrix elements are");
		for(int i=0;i<r;i++)
		{
			for( j=0;j<c;j++)
			{
				System.out.print("\t"+a[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}