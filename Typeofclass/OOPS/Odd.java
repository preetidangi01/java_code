import java.util.Scanner;
class Odd
{
	private int a,s;
    public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int a = sc.nextInt();
		this.a=a;
	}
    public int odd()
	{
		for(int i=1; i<=a ; i++)
		{
			 s=2*i-1;
			 System.out.print(" "+s);
		}
		return s;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Odd ob = new Odd();
		ob.setData(sc);
		int res = ob.odd();
		
	}
}