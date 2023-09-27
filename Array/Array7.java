import java.util.Scanner;
class Arraysum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many element you want to enter");
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[10];
		System.out.println("Enter elemnt in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of element"+sum);
	}
}