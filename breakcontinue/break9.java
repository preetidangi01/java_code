class Test
{
	public static void main(String args[])
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i*j>5)
				 break;
				System.out.println(i+" "+j);
			}
			
		}
	}
}