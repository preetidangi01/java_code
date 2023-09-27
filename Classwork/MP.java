import java.util.Scanner;
class Mark
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter P marks :=");
		int p=sc.nextInt();
		System.out.print("Enter C marks :=");
		int c=sc.nextInt();
		System.out.print("Enter M marks :=");
		int m=sc.nextInt();
		double per;
		int total;
		total=p+c+m;
		per=total/3.0;
		
		if(p>=33&&c>=33&&m>=33)
		{
			if(per>=75)
			{
				System.out.println("Pass BY First Division");
			}			
			else if(per>=59)
			{
				System.out.println("Pass BY Second Division");
			}
			else
			{
				System.out.println("Pass BY Third Division");
			}
		}
		else
		{
			System.out.println("PAPPU Fail Ho Gaya");
		}
	}
}