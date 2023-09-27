import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{//if n =3 ,(!2/1)-(!4/2)+(!6/3)=230.0
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	int x=2;
	double fact=1,sum=0,div=0;
	for(int i=1;i<=n;i++)
	{
		fact=1;
		for(int j=1;j<=x;j++)
		{
			fact=fact*j;
			div=fact/i;
		}	
		if(i%2==1)
			sum=sum+div;
		else
			sum=sum-div;
			x=x+2;
	}
		System.out.println(sum);
	
	}
}