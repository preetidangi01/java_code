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
			fact =fact*i;
			j=(i+1)/fact;
			sum=sum+j;
			i++;
		}
		System.out.println(sum);
	}
}