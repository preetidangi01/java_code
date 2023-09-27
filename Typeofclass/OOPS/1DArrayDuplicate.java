import java.util.Scanner;
class ArrayPrint
{
	private int a[],n;
	public void setData(int a[],int n)
	{
		this.a=a;
		this.n=n;
	}
	public void getData()
	{
		int x=0;
		for(int i=0;i<this.n;i++)
		{
			if(a[i]!=-1)
			{
				for(int j=i+1;j<this.n;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=-1;
					}
				}
				a[x]=a[i];
				x++;
			}
		}
		for(int i=0;i<x;i++)
		 {
			 if(this.a[i]!=-1)
			 {
			 System.out.println("a["+i+"]="+a[i]);
			 }
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
		System.out.println("How Many element you Want:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Element in  array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayPrint ob=new ArrayPrint();
		 ob.setData(a,n);
		  ob.getData();
		 
	}
}