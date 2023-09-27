import java.util.Scanner;
class Array6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many elements you wanna enter");
		int n=sc.nextInt();
		int a[]=new int[n];
			System.out.println("Enter element in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.println("\t array elements are :");
		for(int i=0;i<n;i++)
		{
			System.out.println("\ta["+i+"]="+a[i]);
		}
		
	}
}