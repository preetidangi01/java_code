import java.util.Scanner;
class Pattern3
{
	int n,;
	public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
	public int pattern()
	{
		for(i=1 ; i<=n ; i++)
	    {
		    for(j=1 ; j<=i ; j++)
		    {
				System.out.print(" ");
		    }
			for(k=5 ; k>=i ; k--)
			{
				System.out.print("*"); 
			}
			System.out.println();
	    }
		return i;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Pattern3 ob = new Pattern3();
		ob.setData(sc);
		int res = ob.pattern();
		
	}
}