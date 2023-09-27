// Abstract class
abstract class Person
{
    abstract void printInfo();
}
  
// Abstraction performed using extends
class Employee extends Person 
{
    void printInfo() 
	{
        String name = "avinash";
        int age = 21;
        float salary = 22000.2F;
  
        System.out.println("Person Name   =:"+name);
        System.out.println("Person Age    =:"+age);
        System.out.println("Person Salary =:"+salary);
  
    }
}
// Base class
class Test
{
    public static void main(String args[]) 
	{
        Person s= new Employee();
        s.printInfo();
    }
}