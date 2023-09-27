import java.util.Scanner ;
class MatrixColAscending
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
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				for(int k=j+1;k<r;k++)
				{
					if(a[j][i]>a[k][i])
					{
						int temp=a[k][i];
						a[k][i]=a[j][i];
						a[j][i]=temp;
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