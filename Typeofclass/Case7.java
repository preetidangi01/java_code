class Multiplication
{
	private int a,b;
	
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int mult()
	{
		int c=this.a*this.b;
		return c;
	}
}
class Test
{
	public static void main(String arg[])
	{
		Multiplication ob=new Multiplication();
		ob.setData(6,2);
		int res=ob.mult();
		System.out.println("Multiplication="+res);
	}
}