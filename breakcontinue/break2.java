import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		for(int i=1;i<=10;++i)
		{
		if(i==5)
		break;
		System.out.println(i);
		}
	}
}