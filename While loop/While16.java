import java.util.Scanner;

class Fact
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	 int n=sc.nextInt();
	 int i=1;
	 int pro=1;
	 int div=0;
	 int sum=0;
	 while(i<=n)
	 {
	    pro=pro*i;
	    if(i%2==0)
	    {
	    div=pro/i;
	    sum=sum+div;
	    i++;
	    }
	  
	  else
	    {
	   
	     div=pro/i;
	     sum=sum-div;
	     i++;
	    }
	 }
	 System.out.println(sum);
	}
}

