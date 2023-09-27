import java.util.Scanner;
class Matrix2
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr matrix in colomn");
	int c=sc.nextInt();
	System.out.println("Enetr matrix in row");
	int r=sc.nextInt();
	int a[][]=new int[5][5];
	int b[][]=new int[5][5];
	System.out.println("enter the dimentional matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("matrix-----------------");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(" "+a[i][j]+" ");
		}
		System.out.println("");
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			
			b[i][j]=a[j][i];
		
		}
	}
	System.out.println("T  matrix-----------------");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(" "+b[i][j]+" ");
		}
		System.out.println("");
	}
		
	}
}