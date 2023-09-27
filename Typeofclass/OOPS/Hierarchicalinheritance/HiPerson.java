// Person,Teacher,Student
import java.util.Scanner;
class Person
{
	String name,gender;
	int age;
	public Person(String name,String gender,int age)
	{
       this.name=name;
       this.gender=gender;
       this.age=age;
       //this.salary=salary;
	}
	public void display()
	{
       System.out.println("Name\t\t:\t"+this.name);
       System.out.println("gender\t\t:\t"+this.gender); 
       System.out.println("Age\t\t:\t"+this.age);
       //System.out.println("Salary\t\t:\t"+this.salary);
	}
  
}
class Student extends Person
{
	String student_course;
	int student_id;
    public Student(String name,String gender,int age,String student_course,int student_id)
	{
        super(name,gender,age);
		this.student_course=student_course;
		this.student_id=student_id;
    }
    public void display()
    {
		super.display();
		System.out.println("Student Course\t:\t"+this.student_course);
		System.out.println("Student id\t:\t"+this.student_id);
	}
}
class Teacher extends Person
{
    int teacher_contact;
	String teacher_qualification;
    public Teacher(String name,String gender,int age,int teacher_contact,String teacher_qualification)
    {    
        super(name,gender,age);
        this.teacher_contact=teacher_contact;
        this.teacher_qualification=teacher_qualification;
	}
	 public void display()
    {
		super.display();
		System.out.println("Teacher_Degree\t:\t"+this.teacher_qualification);
		System.out.println("Teacher_contact\t:\t"+this.teacher_contact);
	}
	
}
class Test
{
    public static void main(String args[])
    {
        
        Student ob2=new Student("ABC","Male",20,"Bsc",34455);
        Teacher ob3=new Teacher("Mr.Sharma Sir","Male",27,233447,"Computer_Secince");
		//System.out.println("\n\n-----------------------------------------------\n\n");
		System.out.println("Student details.....");
		//System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		ob2.display();
		System.out.println("\n-----------------------------------------------\n\n");
		System.out.println("Teacher details.....");
		System.out.println("-----------------------------------------------");
		ob3.display();
		System.out.println("\n\n-----------------------------------------------");
    }
}