import java.util.Scanner;

class Arraymax
{
	public static void main(String args[])
	{	
		System.out.println("how many elements you want to enter :");
		Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
		int a[]=new int[10];
		int n,max;
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			max=a[0];
		for(int i=0;i<n;i++)
		{
			if
			{
				(max<a[i])
				max=a[i];
			}	
		}
		System.out.println("Enter Maximum element is"+max);
		
	}
}