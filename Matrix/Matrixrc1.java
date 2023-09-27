import java.util.Scanner;
class Matrix1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr matrix in colomn");
	int c=sc.nextInt();
	System.out.println("Enetr matrix in row");
	int r=sc.nextInt();
	int a[][]=new int[5][5];
	System.out.println("enter the dimentional matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Matrix elements are :");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(" "+a[j][i]+" ");
		}
		System.out.println("");
	}
		
	}
}