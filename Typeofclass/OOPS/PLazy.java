import java.util.Scanner;
class Test
{
	private static Test ob=null;
	private Test()
	{
		System.out.println("Hello ");
	}
	public static Test getValue()
	{
		if(ob==null)
		{
			ob=new Test();
		}
		return ob;
	}
}
class Main
{
	public static void main(String args[])
	{
		Test t1=Test.getValue();
		Test t2= Test.getValue();
		System.out.println("hashcode of t1"+t1.hashcode());
		System.out.println("hashcode of t2"+t2.hashcode());
	}
}