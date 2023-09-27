import java.util.Scanner;
class Digit
{
	int n;
	public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
	public int digit()
	{
		int r=0;
		if(n==0)
			r=0;
		else
			r=n%10+this.digit(n/10);
		    
		return r;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Digit ob = new Digit();
		ob.setData(sc);
		int res = ob.digit();
		System.out.println("Digit="+res);
	}
}