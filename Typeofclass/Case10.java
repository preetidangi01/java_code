import java.util.Scanner;
class Palindrom
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int getData()
	{
		int rev=0;
		for(;this.n>0;this.n/=10)
		{
			int rem=n%10;
			 rev=rev*10+rem;    
		}
		return rev;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Test ob=new Test();
		ob.inputValue(sc);
	}
	public void inputValue(Scanner sc)
	{
		System.out.println("Enter the Value of  n");
		int n=sc.nextInt();
		Palindrom ob=new Palindrom();
		ob.setData(n);
		int x=ob.getData();
		if(x==n)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println(" Not Palindrom");
		}
	}
	
}