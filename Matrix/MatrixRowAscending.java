import java.util.Scanner ;
class MatrixRowAscending
{	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Rows");
		int r=sc.nextInt();
		System.out.println("Enter no. of Colume");
		int c=sc.nextInt();
		int a[][]=new int[5][5];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix------------------------");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				for(int k=j+1;k<c;k++)
				{
					if(a[i][j]>a[i][k])
					{
						int temp=a[i][k];
						a[i][k]=a[i][j];
						a[i][j]=temp;
					}
				}
			}
		}
		System.out.println("Ascending order----------------");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("   "+a[i][j]+"   ");
			}
			System.out.println();
		}
		
	}
}