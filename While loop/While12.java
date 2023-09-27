import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter any number");
	 int n=sc.nextInt();
	 int i=1;
	 int pro=1;
	 int sum=0;
	 while(i<=n)
	 {
	    pro=pro*i;
	    if(i%2==0)
	    {
	    sum=sum-pro;
	    i++;
	    }
	    else
	    {
	    sum=sum+pro;
	    i++;
	    }
	     
	 }
	      System.out.println(sum);
	}
}
