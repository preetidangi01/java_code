class Test
{
	public static void main(String args[])
	{
		int n=5;
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
			for(j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		
	}
	
}
