import java.util.Scanner;
class Multiplication
{
   private int a[][],n,m;
   private int b[][];
   private int c[][];
   public void setData(int a[][],int b[][],int c[][],int n,int m)
   {
	   this.a=a;
	   this.b=b;
	   this.c=c;
	   this.n=n;
	   this.m=m;
   }
   public void getData()
   {
	   
	   for(int i=0;i<this.n;i++)
	   {
		   for(int j=0;j<this.m;j++)
		   {
			   for(int k=0;k<this.m;k++)
			   {
				   c[i][j]+=a[i][k]*b[k][j];
			   }
		   }
	   }
	    for(int i=0;i<this.n;i++)
	   {
		   for(int j=0;j<this.m;j++)
		   {
			   System.out.print(c[i][j]+" ");
		   }
		   System.out.println();
	   }
   }
}
class Test
{
	public static void main(String args[])
	{
		Test ob=new Test();
		ob.input();
	}
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row :");
		int n=sc.nextInt();
		System.out.println("Enter Colum :");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		int c[][]=new int[n][m];
		System.out.println("Enter the Array :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		Multiplication ob=new Multiplication();
		ob.setData(a,b,c,n,m);
		ob.getData();
	}
}