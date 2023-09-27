class C2
{
	public static void display()
	{
		System.out.println("Hello display....");
	}
	public static void main(String args[])
	{
		Test.display();
	}
	static
	{
		System.out.println("Hello static block.....");
		Test.display();
	}
	
}