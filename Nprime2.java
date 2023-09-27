import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//this is the programm to print the series of prime number for example if n=20 then print first 20 prime number
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,count=0,m=2;
		while(count<n)
		{
			boolean prime=true;
			for( i=2;i<m;i++)
			{
				if(m%i==0)
				{
					prime=false;
					break;
				}
			}	
			if(prime)
			{
				System.out.println(m);
			count++;
			}m++;
		}
	}
}



