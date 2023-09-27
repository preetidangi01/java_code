import java.util.Scanner;
class Pow
{
	private int a,b;
    public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int a = sc.nextInt();
		this.a=a;
		System.out.println("Enter Power");
		int b = sc.nextInt();
		this.b=b;
	}
    public int power()
	{
		int power=1;
		for(int i=1; i<=b ; i++)
		{
			power=power*a;
		}
		return power;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Pow ob = new Pow();
		ob.setData(sc);
		int res = ob.power();
		System.out.println("Power="+res);
	}
}