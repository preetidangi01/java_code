//import java.util.Scanner;
class Fruit
{
	String name,color;
	public void SetName(String name)
	{
		this.name=name;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
}
class Banana extends Fruit
{
	int prize;
	String test;
	public void setPrize(int prize)
	{
		this.prize=prize;
	}
	public void setTest(String test)
	{
		this.test=test;
	}
	public void display()
	{
		System.out.println("Fruit_Name ="+this.name);
		System.out.println("Fruit_Color="+this.color);
		System.out.println("Fruit_Prize="+this.prize);
		System.out.println("Fruit_Test ="+this.test);
	}
}
class Test
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		Banana ob=new Banana();
		//ob.setData();
		ob.SetName("Banana");
		ob.setColor("Yellow");
		ob.setPrize(200);
		ob.setTest("Delicious");
		ob.display();
	}
}