import java.util.Scanner;
class Natural
{
	int n,sum=0;
	public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
	public int natural()
	{
		for(int i=1; i<=n ; i++)
		{
			sum=sum+i;
		}
		return sum;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Natural ob = new Natural();
		ob.setData(sc);
		int res = ob.natural();
		System.out.println("Natural="+res);
	}
}