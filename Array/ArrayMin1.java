import java.util.Scanner;
class Arraymin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many elements you want to enter :");
		n=sc.nextInt();
		int a[]=new int[10];
		int n,min;
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
				min=a[0];
		for(int i=0;i<n;i++)
			{
				if
				{
					(min>a[i])
					min=a[i];
				}	
			}
			System.out.println("Enter min value is"+min);
			
	}
}