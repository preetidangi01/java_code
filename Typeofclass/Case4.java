class First
{
	public static void display()
	{
		System.out.println("Hello display......");
	}
	
	static
	{
		System.out.println("Hello static block....");
		First.display();
		Sec.show();
		
	}
}
class Sec
{
	public static void main(String args[])
	{
		System.out.println("-------------------------main---------");
		Sec.show();
		First.display();
		
	}		
	public static void show()
	{
		System.out.println("-----------------------show-----------");
		System.out.println("Hello show......");
		First.display();
		
	}
}
