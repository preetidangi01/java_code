import java.util.Scanner;
class Reverse
{
	int n,sum=0,r=0,k;
	public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
	public int rev()
	{
	    for( ; n>0;)
	    {
		   r=n%10;
		   k=r*r*r;
		   sum=sum+k;
		   n=n/10;
		}
        return sum;		
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Reverse ob = new Reverse();
		ob.setData(sc);
		int res = ob.rev();
		int temp=res;
		if(temp==res)
		{
			System.out.println("Armstrong Num");
		}
		else
		{
			System.out.println("not a Armstrong Num");
		}
		
	}
}