import java.util.Scanner;
class Largest
{
	private int a,b,c;
	public void setData(Scanner sc)
	{
		int a = sc.nextInt();
		this.a=a;
		int b = sc.nextInt();
		this.b=b;
		int c = sc.nextInt();
		this.c=c;
	}
	public void getData()
	{
	   System.out.println("A="+a+"B="+b+"C="+c);
	}
	public int Large()
	{
		if(a>b&&a>c)
			return a;
		else if(a<b&&c<b)
			return b;
		else 
			return c;
	}
}
class Test
{
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		Largest ob = new Largest();
		ob.setData(sc);
		ob.getData();
		int res = ob.Large();
		System.out.println("Result="+res);
	}
}