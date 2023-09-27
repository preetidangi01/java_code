import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	 int n=sc.nextInt();
	 int i=1;
	 int fact=1;
	 int sum=0;
	 while(i<=n)
	  {
	    fact=fact*i;
	    sum=sum+fact;
	    i++;
	  }
	  System.out.println(fact);
	}
}
