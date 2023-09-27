class Test
{
	public static void main(String args[])
	{//to print the sum of this series 
	//!1/1-!2/2+!3/3-!4/4+!5/5=20
		int n=5,i=1,sum=0,div=0,fact=1;
		do{
			if(i%2==0)
			{
				fact*=i;
				div=fact/i;
				sum-=div;
			}
			else
			{
				fact*=i;
				div=fact/i;
				sum+=div;
			}
			i++;
		}while(i<=n);
		System.out.println(sum);
	}
}
