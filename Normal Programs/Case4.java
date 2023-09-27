//Case 3:All method are static define in different in class 
class First
{
	public static void display()
	{
		System.out.println("Hello display....");
	}
	public static void show()
	{
		System.out.println("Hello show.........");
	}
}
class Test
{
	public static void main(String args[])
	{
		
	}
    static 
	{
		System.out.println("Hello static....");
		First.display()l
		First.show();
	}
	
}