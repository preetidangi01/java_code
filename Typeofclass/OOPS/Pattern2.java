import java.util.Scanner;
class Pattern2
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
		  for(j=n ; j>=i ; j--)
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
		Pattern2 ob = new Pattern2();
		ob.setData(sc);
		int res = ob.pattern();
		
	}
}