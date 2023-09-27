import java.util.Scanner;
class Pattern1
{
	int n;
	public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
	public void pattern()
	{
		for(int i=5 ; i>=1 ; i--)
	    {
	        for(int j=1; j<=i ; j++)
		    {
		     System.out.print(j+" ");
		    }
		  System.out.println();
	    }
		
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Pattern1 ob = new Pattern1();
		ob.setData(sc);
		int res = ob.pattern();
		
	}
}