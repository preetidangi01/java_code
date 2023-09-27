import java.util.Scanner;
class MatrixUpperTri
//row major matrix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. colume");
		int c=sc.nextInt();
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
				for(int j=0;j<=i+1;j++)
				{
						System.out.print("   ");
				}
				
				for(int j=i;j<c;j++)
				{
						System.out.print(a[i][j]+"  ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Enter same no. of colume or row ");
	}
}