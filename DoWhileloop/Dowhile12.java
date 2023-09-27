import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//to print the sum of this series 
	//!1-!2+!3-!4+!5=101
		Scanner sc=new Scanner(System.in);
		int n=5,i=1,fact=1,sum=0;
		do{
			if(i%2==0)
			{
				fact*=i;
				i++;
				sum-=fact;
			}
			else
			{
				fact*=i;
				i++;
				sum+=fact;
			}
		}while(i<=n);
		System.out.println(sum);
	}
}
