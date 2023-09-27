class Shape
{
	String name,colour;
	float a,area;
	public Shape(String name,String colour,int a)
	{
		this.name=name;
		this.colour=colour;
		this.a=a;
	}
	//public void abstract area();
}
abstract class TwoD extends Shape
{
	float b;
	public TwoD(String name,String colour,int a)
	{
		super(name,colour,a);
	}
	public abstract void area();
}
class Square extends TwoD
{
	float perimeter,diagonal;
	public Square(String name,String colour,int a)
	{
		super(name,colour,a);
	}

public void area()
{
	area=(float)(a*a);
}	
	public void perimeter()
	{
		perimeter=(float)(4*a);
	}
	public void diagonal()
	{
		diagonal=(float)(a*1.4142);
}
	public void details()
	{
		System.out.println("Side      = "+a);
		System.out.println("Area      = "+area);
		System.out.println("Perimeter = "+perimeter);
		System.out.println("Digonal   = "+diagonal);
	}
}
class Test
{
	public static void main(String args[])
	{
		Square ob=new Square("Square","Red",7);
		ob.area();
		ob.perimeter();
		ob.diagonal();
		ob.details();
	}
}
