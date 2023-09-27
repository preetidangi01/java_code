class Test
{
	public static void main(String args[])
	{//if n=3;(1/3^2)+(2/3^4)+(3/3^6)=0.13991
		int n=3,i,j,x=2;
		double pow,sum=0,div=0;
		for(i=1;i<=n;i++)
		{
			pow=1;
			for(j=1;j<=x;j++)
			{
				pow=pow*n;
			    div=i/pow;
			}
			
			sum=sum+div;
			
			x+=2;
			
		}
		System.out.println(sum);
	}
}