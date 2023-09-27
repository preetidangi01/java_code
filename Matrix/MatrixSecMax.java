import java.util.Scanner;
class MatrixSecMax
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. colume");
		int c=sc.nextInt();
		System.out.println("Enter no. row");
		int r=sc.nextInt();
		int max=0,sec=0;
		int a[][]=new int[5][5];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]>max)
				{
					sec=max;
					max=a[i][j];
				}
				else if(a[i][j]<max&&sec<a[i][j])
				{
					sec=a[i][j];
				}
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("   "+a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("Largest no. in Element is:-"+max);
		System.out.println("Second Largest no. in Element is:-"+sec);
	}
}