import java.util.Scanner;
class Test 

{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
		int n=5;
		int i=1;
		int fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
    }
}