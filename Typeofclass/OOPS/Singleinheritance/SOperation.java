class Operation
{
	int a,b;
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}
class Addition extends Operation
{
	public void display()
	{
		int x=this.a+this.b;
		System.out.println("Addition ="+x);
	}
}
class Test
{
	public static void main(String args[])
	{
		Addition ob=new Addition();
		ob.setData(5,7);
		ob.display();
	}
}