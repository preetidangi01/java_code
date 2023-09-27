package Mypack2;
import Mypack1.Vehicle;
public class Truck extends Vehicle
{
	int t_modelno,t_wheel;
	public Truck(String name,String color,String brand,int capacity,int price,int t_wheel,int t_modelno)
	{
		super(name,color,brand,capacity,price);
		this.t_wheel=t_wheel;
		this.t_modelno=t_modelno;
	}
	public void display()
	{
		super.display();
		System.out.println("Wheel    :="+t_wheel);
		System.out.println("Model_no :="+t_modelno);
	}
}