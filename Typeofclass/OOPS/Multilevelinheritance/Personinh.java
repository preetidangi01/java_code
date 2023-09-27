import java.util.Scanner;
class Person
{
	protected String name,gender;
	protected int age,salary;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void printDetails()
	{
		System.out.println("Name ="+name);
		System.out.println("Gender ="+gender);
		System.out.println("Age ="+age);
		System.out.println("salary ="+salary);
	}
}
class Employee extends Person
{
	private String employeeposition;
	private int employee_id;
	
	public void setEmployeePosition(String employeeposition )
	{
		this.employeeposition=employeeposition;
	}
	public void setEmployee_Id(int employee_id)
	{
		this.employee_id=employee_id;
	}
	
	public void display()
	{
		this.printDetails();
		System.out.println("EmployeePosition ="+employeeposition);
		System.out.println("Employee_Id="+employee_id);
		
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee ob=new Employee();
		
		System.out.println("Enter the Name :");
		String name=sc.nextLine();
		ob.setName(name);
		
		System.out.println("Enter the Gender :");
		String gender=sc.nextLine();
		ob.setGender(gender);
		
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		sc.nextLine();
		ob.setAge(age);
		
		System.out.println("Enter the EmployeePosition");
		String employeeposition=sc.nextLine();
		ob.setEmployeePosition(employeeposition);
		
		System.out.println("Enter the Employee_id :");
		int employee_id=sc.nextInt();
		ob.setEmployee_Id(employee_id);
		
		System.out.println("Enter the Salary ");
		int salary=sc.nextInt();
		ob.setSalary(salary);
		
		ob.display();
	}
}