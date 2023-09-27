import java.util.Scanner;
class ArrayMin2
{
	public static void main(String arg[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element you want in array/n Only 10 no.");
		int n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter no. in array ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int sec=0;
		for(int i=1;i<n;i++)
		{
			if(min>a[i])
			{	
				sec=min;
				min=a[i];	
			}
			else if(a[i]<sec&&a[i]>min)
			{
				sec=a[i];
			}
		}
		System.out.println(" Second Minimum value is "+sec);
	}
}