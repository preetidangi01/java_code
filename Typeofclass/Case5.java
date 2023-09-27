class Addition
{
	private int a,b;
	
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	//public void getdata()
	//{
		//System.out.println("A="+this.a+"B="+this.b);
	//}
	public int add()
	{
		int c=this.a+this.b;
		return c;
	}
}
class Test
{
	public static void main(String args[])
	{
		Addition ob=new Addition();
		ob.setData(5,7);
		int res=ob.add();
		System.out.println("Addition ="+res);
	}
}