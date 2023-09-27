import java.util.Scanner;
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
		System.out.println("Enter the Choice:");
		System.out.println("1 Press  for 2!+4!+6! \n2 press for -2!+4!-6! \n3 press for 2!-4!+6!");
		int ch=sc.nextInt();
		System.out.println("Enter the Value of n:");
		int n=sc.nextInt();
		switch(ch)
		{
			case 1:
					Series ob=new Series();
					ob.setData(n);
					int sum=ob.getData();
					System.out.println("Sum:"+sum);
					break;
			case 2:
					EvenSeries ob1=new EvenSeries();
					ob1.setData(n);
					 sum=ob1.getData();
					System.out.println("Sum:"+sum);
					break;
			case 3:
					OddSeries ob2=new OddSeries();
					ob2.setData(n);
					 sum=ob2.getData();
					System.out.println("Sum:"+sum);
					break;
		}
	}
	
}
class Series
{
	private int n;
		public void setData(int n)
		{
			this.n=n;
		}
	public int getData()
	{
		int sum=0;
		for(int i=1,x=2;i<=this.n;i++)
		{
			int fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			sum+=fact;
			x+=2;
		}
		return sum;
	}	
}
class EvenSeries
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int getData()
	{
		int sum=0;
		for(int i=1,x=2;i<=this.n;i++)
		{
			int fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=fact;
			}
			else
			{
				sum-=fact;
			}
			x+=2;
		}
		return sum;
	} 	
}
class OddSeries
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int getData()
	{
		int sum=0;
		for(int i=1,x=2;i<=this.n;i++)
		{
			int fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum-=fact;
			}
			else
			{
				sum+=fact;
			}
			x+=2;
		}
		return sum;
	} 	
}