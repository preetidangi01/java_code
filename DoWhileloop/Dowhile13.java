class Test
{
	public static void main(String args[])
	{//to print the sum of this series 
	//-!1+!2-!3+!4-!5
		int n=5,i=1,sum=0,fact=1;
		do{
			if(i%2==0)
			{
				fact*=i;
				sum+=fact;
			}
			else
			{
				fact*=i;
				sum-=fact;
			}
			i++;
		}while(i<=n);
		System.out.println(sum);
	}
}
