class Subtration
{
	private int a,b;
	
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int sub()
	{
		int c=this.a-this.b;
		return c;
	}
}
class Test
{
	public static void main(String args[])
	{
		Subtration ob=new Subtration();
		ob.setData(7,5);	
		int res=ob.sub();
		System.out.println("Subtration="+res);
	}
}
