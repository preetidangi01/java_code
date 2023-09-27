import java.util.Scanner;
//POJO class
class CalculatorPOJO
{
	private double a,b,c;
	public void setA(double a)
	{
		this.a=a;
	}
	public void setB(double b)
	{
		this.b;
	}
	public void setC(duble c)
	{
		this.c;
	}
	public double getA()
	{
		return this.a;
	}
	public double getB()
	{
		return this.b;
	}
	public double getC()
	{
		return this.c;
	}
}
//BL class
class CalculatorOperation
{
	public double addTwo(CalculatorPOJO ref)
	{
		return ref.getA()+ref.getB();
	}
	public double sub(CalculatorPOJO ref)
	{
		return ref.getA()-ref.getB(); 
	}
	public double mult(CalculatorPOJO ref)
	{
		return ref.getA()*ref.getB();
	}
	public double div(CalculatorPOJO ref)
	{
		return ref.getA()/ref.getB();
	}
	public double mod(CalculatorPOJO ref)
	{
		return ref.getA()%ref.getB();
	}
}
//client class
class Test
{
	public static void main(String args[])
	{
		CalculatorPOJO ob.new CalculatorPOJO();
		ob.setA(7);
		ob.setB(8);
		
		CalculatorOperation obi=new CalculatorOperation();
		double res=clo.addTwo(ob);
		
		System.out.println("A="+res);
	}
}
