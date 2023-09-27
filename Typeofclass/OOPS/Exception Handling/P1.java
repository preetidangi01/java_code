class Test
{
	public static void main(String []args)
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			
			if(b==0)
			{
				throw new ArithmeticException("the value of b never be zero");
			}
			
			else{
				int  c=a/b;
				System.out.println(c);
			}
		}
		catch(ArithmeticException ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	}	
}