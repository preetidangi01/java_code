class Test
{
	public static void main(String args[])
	{
		int n=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1+i-1;k<=5;k++)
			{
				System.out.print( k );
			}
			System.out.println("");
		} 
	}
}
