import java.util.Scanner;
class ArrayOperation
{
	private int a[];
	private int len;
	private int min;
	private int max;
	public void setData(int len)
	{
		this.a=new int [10];
		this.len=len;
	}
	public int len()
	{
		return a.length;
	}
	public void inputArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in array :");
		for(int i=0;i<this.len;i++)
		{
			a[i]=sc.nextInt();
		}			
	}
	public void showArray()
	{
		System.out.println("Array elements are :");
		for(int i=0;i<this.len;i++)
		{
			System.out.println(" "+a[i]+" ");
		}
	}
	public int sumArray()
	{
		int s,i;
		for(i=0,s=0;i<this.len;s=s+a[i],i++);
			return s;
	}
	public int minArray()
	{
		int i;
		for(i=1,this.min=a[0];i<this.len;i++);
		{
			if(this.min<a[i])
				min=a[i];
		}
		return this.min;
	}
	public int maxAarry()
	{
		int i;
		for(i=1,max=a[0];i<this.len;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
	public int secMinArray()
	{
		int se,i;
		for(i=0,se=Integer.MAX_VALUE;i<this.len;i++)
		{
			if(this.min<a[i]&&se>a[i])
				se=a[i];
		}
		return se;
	}
	public int secMaxArray()
	{
		int se=Integer.MIN_VALUE,i;
		for(i=0;i<this.len;i++)
		{
			if(max>a[i]&&se<a[i])
				se=a[i];
		}
		return se;
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayOperation ob=new ArrayOperation();
		System.out.println("How many elements you want to Enter :");
		int k=sc.nextInt();
		ob.setData(k);
		ob.inputArray();
		ob.showArray();
		
		int sum=ob.sumArray();
		System.out.println("SumArray =:"+sum);
		int min=ob.minArray();
		System.out.println("MinArray =:"+min);
		int max=ob.maxAarry();
		System.out.println("Maximum  =:"+max);
		int smin=ob.secMinArray();
		System.out.println("Second Min =:"+smin);
		int smax=ob.secMaxArray();
		System.out.println("Second Max =:"+smax);
	}
}