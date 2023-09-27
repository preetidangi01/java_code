import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number");
	int n=10;
	int i=1;
	int sume=0;
	int sumo=0;
	int total=0;
	while(i<=n)
	{
		if(i%2==0)
		{
		   sume=sume+i;
		   total=sumo+sume;
		   i++;
		}
		else
		{
		   sumo=sumo+i;
		   total=sumo+sume;
		   i++;
		}	
	}
	System.out.println("SUME="+sume);
	System.out.println("SUMO="+sumo);
	System.out.println("TOTAL="+total);
		
	}
}
