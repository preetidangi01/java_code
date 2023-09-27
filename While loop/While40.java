import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//This program  is to print the entered number is palendrromic or not
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int r=0;
		int i=n;
		while(n>0)
		{
			
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
			if(i==rev)
				System.out.println("It is palindromic sequence");
			else
				System.out.println("It is not palindromic sequence");
		System.out.println(rev);
	}
}
