class First
{
	public static void display()
	{
		System.out.println("Hello display......");
	}
	public static void show()
	{
		System.out.println("Hello show......");
	}
}
class Sec
{
	public static void main(String args[])
	{
		//Test.display();
	}		
	static
	{
		System.out.println("Hello static block....");
		First.display();
		First.show();
		
	}
}
