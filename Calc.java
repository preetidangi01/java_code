import java.util.Scanner;

class CalcSwitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		double div,x,y;
		
		int  res;
		
		System.out.println("\tEnter your choice");
		System.out.println("\t1 for addition:\n\t2 for subtraction");
		System.out.println("\t3 for multiplication:\n\t4 for division");
		System.out.println("\t5 for modulas");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
	
				System.out.println("enter any two number");
				a=sc.nextInt();
				b=sc.nextInt();
				res=a+b;
				System.out.println("\nEnter the addition="+res);
				break;
			case 2:
	
				System.out.println("enter any two number");
				 a=sc.nextInt();
				 b=sc.nextInt();
				res=a-b;
				System.out.println("\nEnter the subtraction="+res);
				break;
			case 3:
		
				System.out.println("enter any two number");
				 a=sc.nextInt();
				 b=sc.nextInt();
				res=a*b;
				System.out.println("\nEnter the multiplication="+res);
				break;
			case 4:
	
				System.out.println("enter any two number");
				x=sc.nextDouble();
				y=sc.nextDouble();
				div=x/y;
				System.out.println("\nEnter the division="+div);
				break;
			case 5:
	
				System.out.println("enter any two number");
				 a=sc.nextInt();
				 b=sc.nextInt();
				 res=a%b;
				System.out.println("\nEnter the modulas="+res);
				break;
		
		}
	}
}
