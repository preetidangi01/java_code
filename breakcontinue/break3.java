import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<3;j++)
			{
				System.out.println(i+" "+j);
				if(i==2)
				break;
			}
		}
	}
}