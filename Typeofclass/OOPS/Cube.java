import java.util.Scanner;
class Cube
{
	private int a,c;
    public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int a = sc.nextInt();
		this.a=a;
	}
    public int cube()
	{
		for(int i=1; i<=a ; i++)
		{
			 c=i*i*i;
		}
		return c;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Cube ob = new Cube();
		ob.setData(sc);
		int res = ob.cube();
		System.out.println("Cube="+res);
	}
}