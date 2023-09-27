import java.util.Scanner;
class Slarge
{
	private int a,b;
	public void setData(Scanner sc)
	{
		int a = sc.nextInt();
		this.a=a;
		int b = sc.nextInt();
		this.b=b;
	}
	public void getData()
	{
	   System.out.println("A="+a+" B="+b);
	}
	public int Second()
	{
		if(a>b)
			return a;
			
		else
			return b;
	}
}
class Test
{
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		Slarge ob = new Slarge();
		ob.setData(sc);
		ob.getData();
		int res = ob.Second();
		System.out.println("Result="+res);
	}
}