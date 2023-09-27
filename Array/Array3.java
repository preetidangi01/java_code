import java.util.Scanner;
class Array3
{
	public static void main(String args[])
	{
		int a[]= new int[5];
		System.out.println("Max 1Size of array="+a.length);
		a[0]=9;
		a[1]=5;
		a[2]=3;
		a[3]=2;
		a[4]=8;
		
		for(int i=0;i<a.length;i++)
		System.out.println("\ta["+i+"]="+a[i]);
		
	}	
}