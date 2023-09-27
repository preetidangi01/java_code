class Test
{
	public static void main(String args[])
	{
		int n=5;
		int i,j,k;
		for(i=n;i>=1;i--)
		{
			for(j=n-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
				System.out.print(" k ");
			}
				System.out.println("");
		} 
	}
}
