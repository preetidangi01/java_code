import java.util.Scanner;
interface ArithmeticCalculations 
{
   public abstract int addition(int a, int b);
   public abstract int subtraction(int a, int b);
}
interface MathCalculations 
{
   public abstract double squareRoot(int a);
   public abstract double powerOf(int a, int b);
}
interface MyInterface extends MathCalculations, ArithmeticCalculations 
{
   public void displayResults();
}
public class ExtendingInterfaceExample implements MyInterface 
{
   public int addition(int a, int b) 
   {
      return a+b;
   }
   public int subtraction(int a, int b) 
   {
      return a-b;
   }
   public double squareRoot(int a) 
   {
      return Math.sqrt(a);
   }
   public double powerOf(int a, int b) 
   {
      return Math.pow(a, b);
   }
   public void displayResults() 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a: ");
      int a = sc.nextInt();
      System.out.println("Enter the value of b: ");
      int b = sc.nextInt();
      ExtendingInterfaceExample obj = new ExtendingInterfaceExample();
      System.out.println("Result of addition: "+obj.addition(a, b));
      System.out.println("Result of subtraction: "+obj.subtraction(a, b));
      System.out.println("Square root of "+a+" is: "+obj.squareRoot(a));
      System.out.println(a+"^"+b+" value is: "+obj.powerOf(a, b));
   }
   public static void main(String args[]) 
   {
      new ExtendingInterfaceExample().displayResults();
   }
}