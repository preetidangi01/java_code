import java.util.Scanner;
abstract class Shape
{
    double side1;
	
	public Shape()
	{
		
	}
	public Shape(double side1)
	{
		this.side1=side1;
	}
    public abstract double area();
} 
abstract class TwoD extends Shape
{
    public TwoD()
	{
		
	}
	public TwoD(double side1)
	{
		super(side1);
	}
	public abstract double perimeter();
}

abstract class OneSide extends TwoD
{	
    public OneSide()
	{
		
	}
	public OneSide(double side1)
	{
		super(side1);
	}
}
class Circle extends OneSide
{
	public Circle()
	{
		
	}
	public Circle(double side1)
	{
		super(side1);
	}
	public double area()
	{
		return (Math.PI*side1*side1);
	}
	public double perimeter()
	{
		return (2*Math.PI*side1);
	}
} 

class Square extends OneSide
{
	Square()
	{
		
	}
	
	Square(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return (side1*side1);
	}
	
	public double perimeter()
	{
		return (4*side1);
	}
	
}

class EquiTriangle extends OneSide
{
	EquiTriangle()
	{
		
	}
	
	EquiTriangle(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return (0.433*side1*side1);
	}
	
	public double perimeter()
	{
		return (3*side1);
	}
}

class Hexagon extends OneSide
{
	Hexagon()
	{
		
	}
	
	Hexagon(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return (2.598*side1*side1);
	}
	
	public double perimeter()
	{
		return (6*side1);
	}
}

abstract class TwoSide extends TwoD
{
	double side2;
	TwoSide()
	{
		
	}
	
	TwoSide(double side1,double side2)
	{
		super(side1);
		this.side2=side2;
	}
}

class Rectangle extends TwoSide
{
	Rectangle()
	{}
	
	Rectangle(double side1,double side2)
	{
		super(side1,side2);
	}
	
     public double area()
	{
		return (side1*side2);
	}
	
	public double perimeter()
	{
		return (2*(side1+side2));
	}	
}

class Isosceles extends TwoSide
{

	Isosceles()
	{}
	
	Isosceles(double side1,double side2)
	{
		super(side1,side2);
	}
	
     public double area()
	{
		return (.5*side2*5);
	}
	
	public double perimeter()
	{
		return (2*(side1)+side2);
	}	
}


class Parallelogram extends TwoSide
{
	Parallelogram()
	{}
	
	Parallelogram(double side1,double side2)
	{
		super(side1,side2);
	}
	
     public double area()
	{
		return (side1*side2);
	}
	
	public double perimeter()
	{
		return (2*(side1+side2));
	}	
}

abstract class ThreeSide extends TwoD
{
	double side2,side3;
	ThreeSide()
	{}
	
	ThreeSide(double side1,double side2,double side3)
	{
		super(side1);
		this.side2=side2;
		this.side3=side3;
	}
}

class Rhombus extends ThreeSide
{
	Rhombus()
	{}
	
	Rhombus(double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	
     public double area()
	{
		return (.5*(side1+side2)*side3);
	}
	
	public double perimeter()
	{
		return (4*(side3));
	}	
}


class Trapezoid extends ThreeSide
{
	Trapezoid()
	{}
	
	Trapezoid(double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	
     public double area()
	{
		return (.5*(side1+side2)*side3);
	}
	
	public double perimeter()
	{
		return (side1+side2+(2*side3));
	}	
}


class Scalene extends ThreeSide
{
	Scalene()
	{}
	
	Scalene(double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	
     public double area()
	{
		return (.5*(side1+side2)*side3);
	}
	
	public double perimeter()
	{
		return (side1+side2+(2*side3));
	}	
}
abstract class ThreeD extends Shape
{
	 public ThreeD()
	{
		
	}
	
	public ThreeD(double side1)
	{
		super(side1);
	}
	public abstract double area();
	public abstract double tsa();
	public abstract double volume();
}
abstract class OneSide1 extends ThreeD
{	
    public OneSide1()
	{
		
	}
	
	public OneSide1(double side1)
	{
		super(side1);
	}
	
}

class Cube extends OneSide1
{
	public Cube(double side1)
	{
		super(side1);
	}
	public double area()
	{
		return 4*side1*side1;
	}
	public double tsa()
	{
		return 6*side1*side1;
	}
	public double volume()
	{
		return side1*side1*side1;
	}
}

class Sphere extends OneSide1
{
	public Sphere(double side1)
	{
		super(side1);
	}
	public double area()
	{
		return 4*3.14*side1*side1;
	}
	public double tsa()
	{
		return 4*3.14*side1*side1;
	}
	public double volume()
	{
		return 4/3*(3.14*side1*side1*side1);
	}
}
class Hemisphere extends OneSide1
{
	public Hemisphere(double side1)
	{
		super(side1);
	}
	public double area()
	{
		return 3*3.14*side1*side1;
	}
	public double tsa()
	{
		return 3*3.14*side1*side1;
	}
	public double volume()
	{
		return 2/3*3.14*side1*side1*side1;
	}	
}
abstract class TwoSide1 extends ThreeD
{
	double side2;
	TwoSide1()
	{
		
	}
	
	TwoSide1(double side1,double side2)
	{
		super(side1);
		this.side2=side2;
	}
}
 class Cylinder extends TwoSide1
{
	Cylinder()
	{
		
	}
	Cylinder(double side1,double side2)
	{
		super(side1,side2);
		
	}
	public double area()
	{
		return 2*3.14*side1*side2;
	}
	public double tsa()
	{
		return 2*3.14*side1*(side1+side2);
	}
	public double volume()
	{
		return 3.14*side1*side1*side2;
	}
}
abstract class ThreeSide1 extends ThreeD
{
	double side2,side3;
	ThreeSide1()
	{}
	
	ThreeSide1(double side1,double side2,double side3)
	{
		super(side1);
		this.side2=side2;
		this.side3=side3;
	}
}
class Cuboid extends ThreeSide1
{
	
	public Cuboid(double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	public double area()
	{
		return 2*side3*(side1+side3);
	}
	public double tsa()
	{
		return 2*((side1*side2)+(side2*side3)+(side1+side3));
	}
	public double volume()
	{
		return (side1*side2*side3);
	}
}


class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch,n;
		do
        {
			System.out.println("\nYour The Choice:");
			System.out.println("\tPress 1 for 2D Shapes :\n\tpress 2 for 3D Shapes:\n\tpress 0 for Exit The Program:");
			System.out.println("Enter The Choice:");
		    ch=sc.nextInt();
        switch(ch)
        {
			case 1:
			boolean exit=false;
                do
				{
                    System.out.println("________________________");
                    System.out.println("\nYour The Choice:");
                    System.out.println("\tPress 1 for Circle :\n\tpress 2 for Square:\n\tpress 3 for Equilateral Triangle:\n\tpress 4 for Hexagon:");
                    System.out.println("\tpress 5 for rectangle :\n\tpress 6 for Isosceles :\n\tpress 7 for Parallelogram :");
					System.out.println("\tpress 8 for Rhombus  :\n\tpress 9 for Trapezoid:\n\tpress 10 for Scalene :");
					System.out.println("\tpress 11 for menu");
                    System.out.println("Enter The Choice:");
                    System.out.println("________________________");
                    n=sc.nextInt();
					switch(n)
                   {
					    case 0:
						System.exit(0);
						break;
						
                        case 1:
						Circle circle = new Circle(2.0);
						System.out.println("Area Of Circle = "+circle.area());
						System.out.println("Perimeter Of Circle = "+circle.perimeter());
						break;
						
						case 2:
						Square square = new Square(2.0);
						System.out.println("Area Of Square = "+square.area());
						System.out.println("Perimeter Of Square = "+square.perimeter());
						break;
		
						case 3:
						EquiTriangle eq = new EquiTriangle(2.0);
						System.out.println("Area Of Equilateral Triangle = "+eq.area());
						System.out.println("Perimeter Of Equilateral Triangle = "+eq.perimeter());
						break;
	    
						case 4:
						Hexagon hx = new Hexagon(2.0);
						System.out.println("Area Of Hexagon = "+hx.area());
						System.out.println("Perimeter Of Hexagon = "+hx.perimeter());
						break;
	    
						case 5:
						Rectangle rt = new Rectangle(2.0,4.0);
						System.out.println("Area Of Rectangle = "+rt.area());
						System.out.println("Perimeter Of Rectangle = "+rt.perimeter());
						break;
		
						case 6:
						Isosceles isc = new Isosceles(2.0,4.0);
						System.out.println("Area Of Isosceles = "+isc.area());
						System.out.println("Perimeter Of Isosceles = "+isc.perimeter());
						break;
		
						case 7:
						Parallelogram prl = new Parallelogram(2.0,4.0);
						System.out.println("Area Of Parallelogram = "+prl.area());
						System.out.println("Perimeter Of Parallelogram = "+prl.perimeter());
						break;

						case 8:
						Rhombus rmb = new Rhombus(2.0,4.0,6.0);
						System.out.println("Area Of Rhombus = "+rmb.area());
						System.out.println("Perimeter Of Rhombus = "+rmb.perimeter());
						break;

						case 9:
						Trapezoid tp = new Trapezoid(2.0,4.0,6.0);
						System.out.println("Area Of Trapezoid = "+tp.area());
						System.out.println("Perimeter Of Trapezoid = "+tp.perimeter());
						break;
		
						case 10:
						Scalene sca = new Scalene(4.0,2.4,1.2);
						System.out.println("Area Of Trapezoid = "+sca.area());
						System.out.println("Perimeter Of Trapezoid = "+sca.perimeter());
						break;
						
						case 11:
						exit=true;    
						break;
						
						default :
						System.out.println("Invalid choice");
						break;
				   }	
				}		                                      
				 while(!exit);
                 break;
                                  
						
		    case 2:
            boolean E=false;
                 do
                 {
                    System.out.println("________________________");
                    System.out.println("\nYour The Choices:");
                    System.out.println("\tpress 1 for cube :\n\tpress 2 for sphere :\n\tpress 3 for Cylinder :\n\tpress 4 for Hemisphere :");
                    System.out.println("\tpress 5 for Cuboid  :\n\tpress 6 for Cone  :\n\tpress 7 for Home Menu");
                    System.out.println("Enter The Choiec:");
                    System.out.println("________________________");
                    int choice=sc.nextInt();
                    switch(choice)
                    {
                     case 1:
					 Cube cu = new Cube(4.0);
					 System.out.println("Curved surface area of cube= "+cu.area());
					 System.out.println("Total surface area of cube= "+cu.tsa());
					 System.out.println("volume of cube = "+cu.volume());
					 break;
			
					case 2:
					Sphere sp= new Sphere(4.0);
					System.out.println("Curved surface area of Sphere= "+sp.area());
					System.out.println("Total surface area of Sphere= "+sp.tsa());
					System.out.println("volume of Sphere = "+sp.volume());
					break;
					
					case 3:
					Cylinder cy= new Cylinder(4.0,2.3);
					System.out.println("Curved surface area of Cylinder= "+cy.area());
					System.out.println("Total surface area of Cylinder= "+cy.tsa());
					System.out.println("volume of Cylinder= "+cy.volume());
					break;
					
					case 4:
					Hemisphere h= new Hemisphere(4.0);
					System.out.println("Curved surface area of Hemisphere= "+h.area());
					System.out.println("Total surface area of Hemisphere= "+h.tsa());
					System.out.println("volume of Hemisphere= "+h.volume());
					break;
	
                    case 5:	
					Cylinder y= new Cylinder(2.2,3.0);
					System.out.println("Curved surface area of Cylinder= "+y.area());
					System.out.println("Total surface area of Cylinder= "+y.tsa());
					System.out.println("volume of Cylinder= "+y.volume());
					break;
	
					case 6:
					Cuboid c= new Cuboid(2.2,3.0,3.4);
					System.out.println("Curved surface area of Cuboid= "+c.area());
					System.out.println("Total surface area of Cuboid= "+c.tsa());
					System.out.println("volume of Cuboid "+c.volume());
					break;
					
					case 7:
                    E=true;
                    break;
					
                    default :
                    System.out.println("Invalid Choice.....");
                    break; 
                   }

                }while(!E);
                break;
				 
                default :
                System.out.println("Invalid Choice.....");
                break; 
                           
            }
        

        }while(ch!=0);
	}
}