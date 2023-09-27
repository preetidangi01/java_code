import java.util.Scanner;
class Array5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("how many element you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.println("\t array element are:");
		for(int i=0;i<n;i++)
			System.out.println("\ta["+i+"]="+a[i]);
	}
}


//outpout
//how many element you want to enter
//3
//Enter elements in array
//45
//45
//56
         //array element are:
        //a[0]=45
        //a[1]=45
        //a[2]=56
