// Java Program to illustrate Inheritance (concise)
//import java.io.*;
import java.util.Scanner;
class Person
{
	String name,gender;
    public void Person(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
		
	}
	public void display()
	{
		System.out.println("Name  =:"+this.name);
		System.out.println("Gender=:"+this.gender);
		
	}
}
class Employee extends Person
{
    int age,salary;
	public void Employee();
	public void Employee(int age,int salary);
	{
		this.age=age;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Age   =:"+this.age);
		System.out.println("Salary=:"+this.salary);	}
}
class Test 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner();
		Employee r1= new Employee("khh");
        r1.display();
		
    }
}