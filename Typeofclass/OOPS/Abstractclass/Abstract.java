abstract class Test
{
	int x;
	public Test(int x)
	{
		this.x=x;
		System.out.println("Test cons...");
	}
	public abstract void display();
}
class Test1 extends Test
{
	int y;
	public Test1(int x,int x2)
	{
		super(x);
		this.y=x2;
		System.out.println("Test1 cons....");
	}
	public void display()
	{
		System.out.println("X="+this.x);
		System.out.println("Y="+this.y);
	}
}
class Test2 extends Test
{
	int z;
	public Test2(int x1,int x2)
	{
		super(x1);
		this.z=x2;
		System.out.println("Test2 Cons...");
	}
	public void display()
	{
		System.out.println("X="+this.x);
		System.out.println("Z="+this.z);
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Test ref;
		Test1 ob1=new Test1(2,4);
		Test2 ob2=new Test2(8,12);
		ref=ob1;
		ref.display();
		ref=ob2;
		ref.display();
	}
}
