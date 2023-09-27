import java.util.Scanner;
class Even
{
	private int a,s;
    public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int a = sc.nextInt();
		this.a=a;
	}
    public int even()
	{
		for(int i=1; i<=a ; i++)
		{
			 s=2*i;
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
		Even ob = new Even();
		ob.setData(sc);
		int res = ob.even();
		
	}
}