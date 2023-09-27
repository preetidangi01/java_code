package Mypack3;
import Mypack1.Vehicle;

public class Car extends Vehicle
{
	int c_wheel;
	public Car()
	{}
	public Car(String name,String color,String brand,int capacity,int price,int c_wheel)
	{
		super(name,color,brand,capacity,price);
		this.c_wheel=c_wheel;
		//this.c_capacity=c_capacity;
	}
	public void display()
	{
		super.display();
		System.out.println("Wheel    :="+c_wheel);
		//System.out.println("Capacity :="+c_capacity);
	}
}