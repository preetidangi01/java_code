class MyException extends Exception
{
	MyException()
	{
		
	}
	MyException(String msg)
	{
		super(msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			
			if(a>100)
		
				throw new MyException("Value is>100 Exception");
			
			else if(a<0)
				
				throw new MyException("Value is<0 Exception");
			else
			{
				System.out.println("Marks="+a);
			}
			
		}
		catch(MyException ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	}
}