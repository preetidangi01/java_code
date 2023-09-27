import java.util.Scanner;
class Square
{
	private int a,s;
    public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int a = sc.nextInt();
		this.a=a;
	}
    public int square()
	{
		for(int i=1; i<=a ; i++)
		{
			 s=i*i;
		}
		return s;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Square ob = new Square();
		ob.setData(sc);
		int res = ob.square();
		System.out.println("Square="+res);
	}
}