abstract class Vehicle 
{
    private String name;
    private String brand;
    private String colour;
    private int seatingCapacity;
    private double cost;

    public abstract void drive();
    public abstract void breakk();

    public void display() 
	{
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Cost: " + cost+"\n\n");
        System.out.println("___________________________________________________");
    }

    public Vehicle(String name, String brand, String colour, int seatingCapacity, double cost) 
	{
        this.name = name;
        this.brand = brand;
        this.colour = colour;
        this.seatingCapacity = seatingCapacity;
        this.cost = cost;
    }

    public String getName() 
	{
        return name;
    }

    public String getBrand() 
	{
        return brand;
    }

    public String getColour()
	{
        return colour;
    }

    public int getSeatingCapacity() 
	{
        return seatingCapacity;
    }

    public double getCost() 
	{
        return cost;
    }
}

abstract class LandTransport extends Vehicle 
{
    private int noOfWheel;

    LandTransport(String name, String brand, String colour, int seatingCapacity, double cost, int noOfWheel) 
	{
        super(name, brand, colour, seatingCapacity, cost);
        this.noOfWheel = noOfWheel;
    }

    public int getNoOfWheel() 
	{
        return noOfWheel;
    }
}

class Cycle extends LandTransport 
{
    public Cycle(String name, String brand, String colour, int seatingCapacity, double cost, int noOfWheel)
	{
        super(name, brand, colour, seatingCapacity, cost, noOfWheel);
    }

    public void drive()
	{
        System.out.println("Cycle is driving\n");
    }

    public void breakk() {
        System.out.println("Brakes applied\n");
    }
}
class Bike extends LandTransport {
    public Bike(String name, String brand, String colour, int seatingCapacity, double cost, int noOfWheel) {
        super(name, brand, colour, seatingCapacity, cost, noOfWheel);
    }

    public void drive() {
        System.out.println("Bike is driving\n");
    }

    public void breakk() {
        System.out.println("Brakes applied\n");
    }
}
class Car extends LandTransport {
    public Car(String name, String brand, String colour, int seatingCapacity, double cost, int noOfWheel) {
        super(name, brand, colour, seatingCapacity, cost, noOfWheel);
    }

    public void drive() {
        System.out.println("Car is driving\n");
    }

    public void breakk() {
        System.out.println("Brakes applied\n");
    }
}

abstract class WaterTransport extends Vehicle {
	
    WaterTransport(String name, String brand, String colour, int seatingCapacity, double cost) {
        super(name, brand, colour, seatingCapacity, cost);
    }
}
class SubMarine extends WaterTransport{
    public SubMarine(String name, String brand, String colour, int seatingCapacity, double cost) {
        super(name, brand, colour, seatingCapacity, cost);
    }

    public void drive() {
        System.out.println("Submarine is Diving\n");
    }

    public void breakk() {
        System.out.println("Submarine is coming to surface\n");
    }
}
class Boat extends WaterTransport{
    public Boat(String name, String brand, String colour, int seatingCapacity, double cost) {
        super(name, brand, colour, seatingCapacity, cost);
    }

    public void drive() {
        System.out.println("Boat is Driving\n");
    }

    public void breakk() {
        System.out.println("Boat is Stopping\n");
    }
}
class Ship extends WaterTransport{
    public Ship(String name, String brand, String colour, int seatingCapacity, double cost) {
        super(name, brand, colour, seatingCapacity, cost);
    }

    public void drive() {
        System.out.println("Ship is Driving\n");
    }

    public void breakk() {
        System.out.println("Ship is Stopping\n");
    }
}
abstract class AirTransport extends Vehicle {
	
    AirTransport(String name, String brand, String colour, int seatingCapacity, double cost) {
        super(name, brand, colour, seatingCapacity, cost);
    }
}
class Helicopter extends AirTransport
{
	private int blades;
    Helicopter(String name, String brand, String colour, int seatingCapacity, double cost,int blades) {
        super(name, brand, colour, seatingCapacity, cost);
		this.blades=blades;
	}
	public void drive() {
        System.out.println("Helicopter is flying \n");
    }

    public void breakk() {
        System.out.println("Helicopter is landing\n");
    }
    
}
class Airplane extends AirTransport
{
    Airplane(String name, String brand, String colour, int seatingCapacity, double cost,int blades) {
        super(name, brand, colour, seatingCapacity, cost);
	}
	public void drive() {
        System.out.println("Airplane is flying \n");
    }

    public void breakk() {
        System.out.println("Airplane is landing\n");
    }
    
}
class Jet extends AirTransport
{
    Jet(String name, String brand, String colour, int seatingCapacity, double cost,int blades) {
        super(name, brand, colour, seatingCapacity, cost);
	}
	public void drive() {
        System.out.println("Jet is flying \n");
    }

    public void breakk() {
        System.out.println("Jet is landing\n");
    }
    
}
class Main {
    public static void main(String[] args) {
        Cycle c = new Cycle("Cycle", "Lifelong", "Black", 1, 6999, 2);
        c.drive();
        c.breakk();
        c.display();
		
		  Bike b = new Bike("Bike", "Honda", "Black", 2,80000, 2);
        b.drive();
        b.breakk();
        b.display();
		
		Car car= new Car("Car ", "Mercedes", "Black", 6,6300000, 4);
        car.drive();
        car.breakk();
        car.display();
		
		SubMarine sm= new SubMarine("Subamrine", "Dabur", "Black", 200,12000000);
        sm.drive();
        sm.breakk();
        sm.display();
		
		Boat bo= new Boat("Boat", "Private", "Brown", 4,12000);
        bo.drive();
        bo.breakk();
        bo.display();
		
		Ship sh= new Ship("Ship", "Titanic", "Black", 400,100000000);
        sh.drive();
        sh.breakk();
        sh.display();
		
		Helicopter hl= new Helicopter("Helicopter", "AirIndia", "Black", 6,100000000,1);
        hl.drive();
        hl.breakk();
        hl.display();
		
		Airplane ar= new Airplane("Airplane", "AirIndia", "Black",40,100000000,1);
        ar.drive();
        ar.breakk();
        ar.display();
		
		Jet j= new Jet("Airplane", "AirIndia", "Black",40,100000000,1);
        j.drive();
        j.breakk();
        j.display();
    }
}