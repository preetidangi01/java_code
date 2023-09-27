import java.util.Scanner;
class Array8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many element you want to enter");
		int n=sc.nextInt();
		int a[]=new int[10];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("actual order of array is :");
		for(int i=0;i<n;i++) 
		{
		System.out.println("\ta["+i+"]="+a[i]);
		}
		for(int i=0;i<n/2;i++)
		{
			int temp;
			temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		System.out.println("Reverse order of array is :");
		for(int i=0;i<n;i++)
		{
			System.out.println("\tsa["+i+"]="+a[i]);
		}
	}
}