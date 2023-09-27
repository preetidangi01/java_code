class BankException extends Exception
{
	public BankException(String a)
	{
		super(a);
	}
}
class Test
{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			if(a<=0)
			
			throw new BankException("Enter valid amount");
			else if(a>10000)
				throw new BankException("Invalid");
			else if(a<=10000)
				System.out.println("Done");
			
		}
		catch(BankException b)
		{
			System.out.println(b.getMessage());
		}
	}
}