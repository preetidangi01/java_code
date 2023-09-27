import java.util.Scanner;
class Vehicle
{
	protected String color,brand,capacity;
	int prize;
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setCapacity(String capacity)
	{
		this.capacity=capacity;
	}
	public void setPrize(int prize)
	{
		this.prize=prize;
	}
}
class Truck extends Vehicle
{
	String t_name;
	int t_wheel,t_model_no;
	public void setT_name(String t_name)
	{
		this.t_name=t_name;
	}
	public void setT_wheel(int t_wheel)
	{
		this.t_wheel=t_wheel;
	}
	public void setT_model_no(int t_model_no)
	{
		this.t_model_no=t_model_no;
	}
	public void display()
	{
		System.out.println("brand    :="+brand);
		System.out.println("Color    :="+color);
		System.out.println("Name     :="+t_name);
		System.out.println("Prize    :="+prize);
		System.out.println("Model_no :="+t_model_no);
		System.out.println("Capacity=:"+capacity);
		System.out.println("Wheel    :="+t_wheel);
		
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Truck tc=new Truck();
		tc.setT_name("TATA ULTRA");
		tc.setT_wheel(8);
		tc.setT_model_no(420);
		tc.setColor("BLACK");
		tc.setBrand("TATA");
		tc.setCapacity("20_ton");
		tc.setPrize(2400000);
		tc.display();
	}
}