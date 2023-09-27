import java.util.Scanner;

class Student
{
	int rno;
	String name;
	public Student()
	{
	
	}
	public Student(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Roll Number  =:"+this.rno);
		System.out.println("Student Name =:"+this.name);
	}
}
interface Extra
	{
		int total();
	}
class Marks extends Student 
{
	int p,c,m;
	public Marks()
	{
		
	}
	public Marks(int p,int c,int m,int rno,String name)
	{
		super(rno,name);
		this.p=p;
		this.c=c;
		this.m=m;
	}
	public void display()
	{
		super.display();
		System.out.println("Physics      =:"+this.p);
		System.out.println("Chemistry    =:"+this.c);
		System.out.println("Mathematics  =:"+this.m);
	}
}
class Result extends Marks implements Extra
{
	public Result()
	{
		
	}
	public Result(int p,int c, int m,int rno,String name)
	{
		super(p,c,m,rno,name);
	}
	//@override
	public int total()
	{
		return this.p+this.c+this.m;
	}
	public void display()
	{
		super.display();
	}
	public double percantage(double tot)
	{
		double per=tot/3.0;
		return per;
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p marks ");
		int p= sc.nextInt();
		System.out.println("enter c marks ");
		int c=sc.nextInt();
		System.out.println("enter m marks ");
		int m=sc.nextInt();
		System.out.println("enter roll no ");
		int rno=sc.nextInt();
		System.out.println("enter the name ");
		sc.nextLine();
		String name=sc.nextLine();
		Result ob=new Result(p,c,m,rno, name);
		ob.display();
		int tot=ob.total();
		System.out.println("Total        =:"+tot);
		double per=ob.percantage(tot);
		System.out.println("Percantage   =:"+per);
		
		
		
		/* Result ob=new Result(80,90,80,4433,"Rahul");
		ob.display();
		int tot=ob.total();
		double per=ob.Percantage(tot);
		System.out.println("Total Marks"+tot);
		System.out.println("Percantage"+per); */
	}
}