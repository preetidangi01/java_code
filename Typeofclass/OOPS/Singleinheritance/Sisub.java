class Operation
{
	int a,b;
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}
class Subtraction extends Operation
{
	public void display()
	{
		int x=this.a-this.b;
		System.out.println("Addition ="+x);
	}
}
class Test
{
	public static void main(String args[])
	{
		Subtraction ob=new Subtraction();
		ob.setData(7,5);
		ob.display();
	}
}