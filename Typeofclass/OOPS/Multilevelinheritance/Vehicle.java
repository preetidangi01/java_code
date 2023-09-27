class Vehicle
{
	String name,color,brand;
	int prize;
	public void setData(String name,String color,String brand,int prize)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.prize=prize;
	}
	public void display()
	{
		System.out.println("Name ="+this.name);
		System.out.println("Color ="+this.color);
		System.out.println("Brand ="+this.brand);
		System.out.println("Prize ="+this.prize);
	}
}
class Car extends Vehicle
{
	String capacity;
	int wheel;
	public void setData(String name,String color,String brand,int prize,String capacity,int wheel)
	{
		this.setData(String name,String color,String brand,int prize)
		this.capacity=capacity;
		this.wheel=wheel;
	}
	public void display()
	{
		this.display();
		System.out.println("Capacity ="+this.capacity);
		System.out.println("Wheel ="+this.wheel);
	}
}
class Bike extends Car
{
	String start,Gair;
	public void setData(String name,String color,String brand,int prize,String capacity,int wheel,String start, String gair)
	{
		this.start=start;
		this.gair=gair;
	}
	public void display()
	{
		System.out.println("Start ="+this.capacity);
		System.out.println("Gair ="+this.gair);
	}
}
class Test
{
	public static void main(String args[])
	{
		Car re=new Car();
		re.display();
	}
}
