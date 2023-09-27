import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	 int n=sc.nextInt();
	 int i=1;
	 int sum=0;
	 while(i<=n)
	 {
	    sum=sum+i;
	    if(i<n)
	    System.out.println(i+"+");
	    i++;
	 }
	  System.out.println(" ="+sum);
	}
}
