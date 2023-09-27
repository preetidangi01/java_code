package Mypack1;

public class Vehicle
{
	protected String name,color,brand;
	int price,capacity;
	public Vehicle()
	{
		
	}
	public Vehicle(String name,String color,String brand,int capacity,int price)
	{
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.capacity=capacity;
		this.price=price;
	}
	public void display()
	{
		System.out.println("Name     :="+name);
		System.out.println("Color    :="+color);
		System.out.println("brand    :="+brand);
		System.out.println("Capacity :="+capacity);
		System.out.println("Price    :="+price);
	}
}
