import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//to print the sum of this series 
	//1-2+3-4+5-6+7-8+9-10; Separate for even and odd digits.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =10;
		int sume=0,sumo=0,i=1;
		do{
			if(i%2==0)
			{
				sume-=i;
				i++;
			}
			else
			{
				sumo+=i;
				i++;
			}
		}
		while(i<=n);
		int total=sume+sumo;
		System.out.println("Sum even"+sume);
		System.out.println("Sum odd"+sumo);
		System.out.println("Sum Total"+total);
	}
}
