import java.util.Scanner;
class Prime
{
	int n,count=0,i=1;
	public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
	public int prime()
	{
	    while(i<=n)
		{

		   if(n%i==0)
		   {
		     count++;
		   }
		   i++;
		}
        return count;		
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Prime ob = new Prime();
		ob.setData(sc);
		int res = ob.prime();
		
		if(res==2)
		{
			System.out.println("Prime Num");
		}
		else
		{
			System.out.println("not a Prime Num");
		}
		
	}
}