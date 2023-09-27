import Mypack2.Truck;
import Mypack3.Car;

public class VTest
{
	public static void main(String args[])
	{	
		System.out.print("Truck Detail........");
		Truck ob1=new Truck("Mahindra","Black","Tata-Moters",2,8000000,6,4545);
		System.out.println("\n------------------------------------");
		ob1.display();
		System.out.println("\n------------------------------------");
		System.out.println("Car Detail........");
		Car ob2=new Car("Jeguar","Black","Tata-Moters",4,10000000,4);
		System.out.println("\n------------------------------------\n");
		ob2.display();
		System.out.println("\n------------------------------------\n");
	}
}
