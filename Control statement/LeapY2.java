import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		
		if(year%4==0&&year%100==0&&year%400!=0)
		{
			System.out.println(" It is not a Leap year");
		}
		else if(year%4==0&&year%100==0&&year%400==0)
		{
			System.out.println(" It is a Leap year");
		}
		else if(year%4==0&&year!=100)
		{
			System.out.println(" It is a Leap year");
		}
		else
		{
			System.out.println(" It is not a Leap year");
		}
	}
}