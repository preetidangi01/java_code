//Inner class
class Student
{
	int rno,hno;
	String name,city,state;
	Address add;
	
	public Student(int rno,String name,int hno,String city,String state)
	{
		this.rno=rno;
		this.name=name;
		this.hno=hno;
		this.city=city;
		this.state=state;
	}
	public void displayStud()
	{
		System.out.println("Roll no :="+this.rno);
		System.out.println("Name    :="+this.name);
		this.add.displayAdd();
	}
}
class Address
{
	int hno;
	String city,state;
	public void Address(int hno,String city,String state)
	{
		this.hno=hno;
		this.city=city;
		this.state=state;
	}
	public void displayAdd()
	{
		System.out.println("Hno   :="+this.hno);
		System.out.println("City  :="+this.city);
		System.out.println("State :="+this.state);
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Student ob=new Student(101,"Lalu",333,"Indore","M.P");
		ob.displayStud();
	}
}
