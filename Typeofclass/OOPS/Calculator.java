import java.util.Scanner;
class Calculator
{
	private double a,b;
	public void setData(double a, double b)
	{
		this.a=a;
		this.b=b;
	}
	public double add()
	{
		return this.a+this.b;
	}
	public double sub()
	{
		return this.a-this.b;
	}
	public double mult()
	{
		return this.a*this.b;
	}
	public double div()
	{
		return this.a/this.b;
	}
	public double mod()
	{
		return this.a%this.b;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int ch;
		double x,y,res;
		Calculator ob=new Calculator();
		
		do
		{
			
			System.out.println("\t1 for Addition :\n\t2 for Subtraction :");
			System.out.println("\t3 for Multiplication :\n\t4 for Division :");
			System.out.println("\t5 for Modulus :\n\t6 for Exit :");
			System.out.println("\n\t Enter your choice :");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
				System.out.println("Enter any tow number :");
				x=sc.nextDouble();
				y=sc.nextDouble();
				ob.setData(x,y);
				res=ob.add();
				System.out.println("Addition="+res);
				break;
				
				case 2:
				System.out.println("Enter any tow number :");
				x=sc.nextDouble();
				y=sc.nextDouble();
				ob.setData(x,y);
				res=ob.sub();
				System.out.println("Subtraction="+res);
				break;
				
				case 3:
				System.out.println("Enter any tow number :");
				x=sc.nextDouble();
				y=sc.nextDouble();
				ob.setData(x,y);
				res=ob.mult();
				System.out.println("Multiplication="+res);
				break;
				
				case 4:
				System.out.println("Enter any tow number :");
				x=sc.nextDouble();
				y=sc.nextDouble();
				ob.setData(x,y);
				res=ob.div();
				System.out.println("Division ="+res);
				break;
				
				case 5:
				System.out.println("Enter any tow number :");
				x=sc.nextDouble();
				y=sc.nextDouble();
				ob.setData(x,y);
				res=ob.mod();
				System.out.println("Modulus="+res);
				break;
				
			}
			
		}
		while(ch!=6);
	}
}
