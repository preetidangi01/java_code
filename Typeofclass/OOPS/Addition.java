import java.util.Scanner;
class Addition
{
	private int a,b;
	public  void setData( Scanner sc)
	{
		 int a = sc.nextInt();
		 this.a=a;
		 int b = sc.nextInt();
		 this.b=b;
	}
	public void getData()
	{
		System.out.println("A="+a+"B="+b);
	}
	public int add()
	{
		int c=this.a+this.b;
		return c;
	}
}
class Test
{
	public static void main(String args[])
	{
		Addition ob = new Addition();
		Scanner sc = new Scanner(System.in);
		ob.setData(sc);
		ob.getData();
		int res = ob.add();
		System.out.println("Result="+res);
	}
}