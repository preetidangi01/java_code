import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any numbers");
	int n=sc.nextInt();
	int a[]={1,2,3,4,5,6,7};
	for(int x:a )
	{
		System.out.print(" "+x+" ");
	}
	System.out.println("");
	}
}