import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	 int n=sc.nextInt();
	 int i=1;
	 int x=0;
	 int sum=0;
	 while(i<=n)
	   {
	    	x=2*i;
	    	sum=sum+x;
	     	System.out.println(x+ " ");
	     	i++;
	   }
	     System.out.println(sum);
	}
}
