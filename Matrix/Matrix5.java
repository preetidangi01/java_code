import java.util.Scanner;
class Mx5
//row major matrix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. colume");
		int c=sc.nextInt();
		System.out.println("Enter no. row");
		int r=sc.nextInt();
		int sum=0;
		int a[][]=new int[5][5];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		if(r==c&&r%2!=0)
		{
			System.out.println("\nMatrix is------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+"\t");
					sum=sum+a[i][j];
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
			System.out.println("\nMatrix without in is------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(i==0||i==r-1)
					{
						System.out.print(a[i][j]+"\t");
						sum=sum+a[i][j];
					}
					else if(j==0||j==c-1)
					{
						System.out.print(a[i][j]+"\t");
						sum=sum+a[i][j];
					}
					else 
					{	System.out.print("\t");}
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
			System.out.println("\nMatrix without out is------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(i==0||i==r-1)
					{
						System.out.print("\t");
						sum=sum+a[i][j];
					}
					else if(j==0||j==c-1)
					{
						System.out.print("\t");
						sum=sum+a[i][j];
					}
					else 
					{	System.out.print(a[i][j]+"\t");sum=sum+a[i][j];}
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
			System.out.println("\nMatrix digonal------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(i==j) 
					{
						System.out.print(a[i][j]+"\t");
						sum=sum+a[i][j];
					}
					else
					{	System.out.print(" \t");	}
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
			System.out.println("\nMatrix center------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{	
					if(j==c/2)
					{	System.out.print(a[i][j]+"\t");sum=sum+a[i][j];	}
					else
					{	System.out.print(" \t");	}
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
			System.out.println("\nMatrix RHS digonal------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{	
					if(j==c-i-1)
					{	System.out.print(a[i][j]+"\t");sum=sum+a[i][j];	}	
					else
					{	System.out.print(" \t");	}
					
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
			System.out.println("\nMatrix all of this------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{	
					if(i==j) 
					{	System.out.print(a[i][j]+"\t");sum=sum+a[i][j];}
					else if(j==c/2)
					{	System.out.print(a[i][j]+"\t");	sum=sum+a[i][j];}
					else if(j==c-i-1)
					{	System.out.print(a[i][j]+"\t");sum=sum+a[i][j];	}	
					else
					{	System.out.print(" \t");	}
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
		}
		else 
		{	System.out.println("Not possible");}
	}
