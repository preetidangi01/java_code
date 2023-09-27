
class Test
{
	public static void main(String args[])
	{//To check the number is armstrong or not
	int n =153;
	int m=n;
	int sum=0;
		int i=1;
		int result=1;
		while(n>0)
		{
			int r=n%10;
			result=r*r*r;
			sum=sum+result;
			n=n/10;
		}
		if(sum == m)
            System.out.println(m + " is an Armstrong number.");
        else
            System.out.println(m+ " is not an Armstrong number.");
		
	}
}























