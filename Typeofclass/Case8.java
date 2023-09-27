class Division
{
	private double a,b;
	
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double div()
	{
		double c=this.a/this.b;
		return c;
	}
}
class Test
{
	public static void main(String arg[])
	{
		Division ob=new Division();
		ob.setData(6,2);
		double res=ob.div();
		System.out.println("Multiplication="+res);
	}
}