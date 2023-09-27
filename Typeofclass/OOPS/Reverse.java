import java.util.Scanner;
class Reverse
{
	int n,sum=0;
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
		   r=r+n%10;
		   sum=sum*10+r;
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
		System.out.println("Reverse="+res);
	}
}