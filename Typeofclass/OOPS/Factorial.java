class Factorial
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int fact()
	{
		int i,f;
	}
}
class Test
{
	public static void main(String args[])
	{
		Factorial ob=new Factorial();
		ob.setData(6);
		int res=ob.fact();
		System.out.println("Factorial ="+res);
	}
}