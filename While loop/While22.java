class Test
{
	public static void main(String args[])
	{
		double n=5;
		double i=1;
		double fact=1;
		double sum=0;
		double j=0;
		while(i<=n)
		{
			if(i%2==0)
			{
			fact =fact*i;
			j=fact/(i+1);
			sum=sum-j;
			i++;
			}
			else
			{
			fact =fact*i;
			j=fact/(i+1);
			sum=sum+j;
			i++;
	
			}
		}
		System.out.println(sum);
	}
}  