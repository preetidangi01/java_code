import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	 int n=sc.nextInt();
	 int i=0;
	 int ans=1;
	 while(i<n)
	   {
	    	ans=ans+i;
	     	i++;
	     	System.out.println(ans+ " ");
	   }
	
	}
}
