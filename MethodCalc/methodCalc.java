import java.util.Scanner;

class Calc
{
	public int add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int res=a+b;
		//System.out.println("\nEnter the addition="+res);
		return res;
	}
	public int sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int res=a-b;
		//System.out.println("\nEnter the subtraction="+res);
		return res;		
	}
	public int mult()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int res=a*b;
		//System.out.println("\nEnter the multiplication="+res);
			return res;		
	}
	public double div()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		double a=sc.nextDouble();
		System.out.println("Enter value of b :");
		double b=sc.nextDouble();
		double div=a/b;
		//System.out.println("\nEnter the division="+div);
		return div;		
	}
	public int mod() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		int res=a%b;
	//	System.out.println("\nEnter the modulas="+res);
		return res;		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\tEnter your choice");
		System.out.println("\t1 for addition:\n\t2 for subtraction");
		System.out.println("\t3 for multiplication:\n\t4 for division");
		System.out.println("\t5 for modules");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		Calc ob=new Calc();
		switch(ch)
		{
			case 1:
				int add=ob.add();
				System.out.println("addition="+add);
				break;
			case 2:	
				int sub=ob.sub();
				System.out.println("Subtraction="+sub);
				break;
			case 3:
				int mult=ob.mult();
				System.out.println("Multiplication="+mult);
				break;
			case 4:
				double div=ob.div();
				System.out.println("Division="+div);
				break;
			case 5:	
				int mod=ob.mod();
				System.out.println("Modules"+mod);
				break;
		}	
		
	}
}
