import java.util.Scanner;
class PosiNega
{
	private int num;
	public void setData(Scanner sc)
	{
		int num = sc.nextInt();
		this.num  = num;
	}
	
	public int PoNe()
	{
		boolean b;
		if(num>0)
		  return true;
		else 
			return false;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PosiNega ob = new PosiNega();
		ob.setData(sc);
		int res = ob.PoNe();
		System.out.println("Result="+res);
	}	
}