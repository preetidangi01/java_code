class Test 
{
	public int preeti()
	{
		int a=7,b=5;
		return a+b;
	}
	public int nihar()
	{
		int a=8,b=9;
		return a*b;
	}
	public static void main(String arg[])
	{
		Test ob=new Test();
		int x=ob.preeti();
		int y=ob.nihar();
		System.out.println("Addition ="+x);
		System.out.println("Multiplication ="+y);
	}
}