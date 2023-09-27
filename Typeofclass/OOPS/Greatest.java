class Greatest
{
	private double a,b,c,d;
	public void setData(int a,int b,int c,int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public void gr()
	{
		if(a>b && a>c && a>d)
			System.out.println("A is Greatest.....");
		else if(b>c && b>d)
			System.out.println("B is Greatest.....");
		else if(c>d)
			System.out.println("C is Greatest.....");
		else
			System.out.println("D is Greatest.....");
	}
}
class Test
{
	public static void main(String args[])
	{
		Greatest ob=new Greatest();
		ob.setData(8,74,25,90);
		ob.gr();
	}
}
