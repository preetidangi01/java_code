import java.util.Scanner;
class Factorial
{
	private int a;
    public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int a = sc.nextInt();
		this.a=a;
	}
    public int fact()
	{
		int fact=1;
		for(int i=1; i<=a ; i++)
		{
			fact=fact*i;
		}
		return fact;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Factorial ob = new Factorial();
		ob.setData(sc);
		int res = ob.fact();
		System.out.println("Factorial="+res);
	}
}