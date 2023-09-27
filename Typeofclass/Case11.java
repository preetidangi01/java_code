import java.util.Scanner;
class Addition
{
	private double a,b;
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
		
	}
	public double getData()
	{
		double c=this.a+this.b;
		return c;
		
	}
	
}

class Substraction
{
	private double a,b;
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
		
	}
	public double getData()
	{
		double c=this.a-this.b;
		return c;
		
	}
	
}
class Multiplication
{
	private double a,b;
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
		
	}
	public double getData()
	{
		double c=this.a*this.b;
		return c;
		
	}
	
}
class Division
{
	private double a,b;
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
		
	}
	public double getData()
	{
		double c=this.a/this.b;
		return c;
		
	}
	
}
class Modulues
{
	private double a,b;
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
		
	}
	public double getData()
	{
		double c=this.a%this.b;
		return c;
		
	}
	
}
class Test1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Test1 ob=new Test1();
		ob.calculation(sc);
	}
		
	public void calculation(Scanner sc)
	{
		System.out.println("1press for Addition: \n2 press  for Substraction: \n3 press for Multiplication:\n4 press for Division: \n5 press for Modulues:");
		//System.out.println("Press 6 for Exit");
		int ch=sc.nextInt();
		System.out.println("Enter the Value of a:");
		double a=sc.nextDouble();
		
		System.out.println("Enter the Value of b:");
		double b=sc.nextDouble();
		switch(ch)
		{
			case 1:
					Addition ob=new Addition();
					ob.setData(a,b);
					double c=ob.getData();
					System.out.println("Addition:"+c);
			case 2:
					Substraction ob1=new Substraction();
					ob1.setData(a,b);
					 c=ob1.getData();
					System.out.println("Substraction:"+c);
			case 3:
							
					Multiplication ob2=new Multiplication();
					ob2.setData(a,b);
					 c=ob2.getData();
					System.out.println("Multiplication:"+c);
			case 4:
					Division ob3=new Division();
					ob3.setData(a,b);
					 c=ob3.getData();
					System.out.println("Division:"+c);
					break;
			case 5:
					Modulues ob4=new Modulues();
					ob4.setData(a,b);
					 c=ob4.getData();
					System.out.println("Modulues:"+c);
					break;
			default:
					System.out.println("...........Invalid choice............");
					break;
				}
	
		}
				
}