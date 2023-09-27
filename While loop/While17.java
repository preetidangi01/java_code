import java.util.Scanner;

class Fact
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	 double n=sc.nextDouble();
	 double i=1;
	 double pro=1;
	 double div=0;
	 double  sum=0;
	 while(i<=n)
	 {
	    pro=pro*i;
	    if(i%2==0)
	    {
	    div=i/pro;
	    sum=sum-div;
	    i++;
	    }
	  
	  else
	    {
	   
	     div=i/pro;
	     sum=sum+div;
	     i++;
	    }
	 }
	 System.out.println(sum);
	}
}

