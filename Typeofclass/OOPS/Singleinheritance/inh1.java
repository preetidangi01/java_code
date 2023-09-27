class Square
{
	int a;
	public void setData(int a)
	{
		this.a=a;
	}
	public int sq()
	{
		return this.a*this.a;
	}
}
class Addition extends Square
{
	private int b;
	public void setData(int a,int b)
	{
		this.setData(a);
		this.b=b;
	}
	public int add()
	{
		return this.a+this.b;
	}
}
class Main
{
	public static void main(String args[])
	{
		/*Square ob=new Square();
		ob.setData(8);
		System.out.println("Square ="+ob.sq());*/
		Addition ob2=new Addition();
		ob2.setData(5,7);
		System.out.println("Addition ="+ob2.add());
		System.out.println("  Square ="+ob2.sq());
		
	}
}  