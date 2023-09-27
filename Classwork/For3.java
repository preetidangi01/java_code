class Test
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5+1-i;j>=1;j--)
			{
				for(int k=1;k<=i*2-1;k++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
		}
	}
}