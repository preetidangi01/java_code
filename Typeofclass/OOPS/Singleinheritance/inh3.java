class Cube
{
	int a;
	public void setData(int a )
	{
		this.a=a;
	}
	public int cu()
	{
		return this.a*this.a*this.a;
	}
}
class Addition extends Cube
{
	private int b ,c;
	public void setData(int a, int b,int c)
	{
		this.setData(a);
		this.b=b;
		this.c=c;
	}
	public int add()
	{
		return this.a+this.b+this.c;
	}
}
class Main
{
	public static void main(String argd[])
	{
		Addition ob=new Addition();
		ob.setData(2,3,5);
		System.out.println("Adition ="+ob.add());
		System.out.println("   Cube ="+ob.cu());
		
	}
}
