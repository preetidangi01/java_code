import java.util.Scanner;
class ThreadC
{
	public void test(String msg)
	{
		System.out.println("India is a"+msg);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{}
		System.out.println("Country");
	}
}
class ChildThread extends Thread
{
	String Message;
	ThreadSyn tob;
	Thread toh;
	public ChildThread(ThreadSyn tob, String msg)
	{
		this.tob=tob;
		this.Message=msg;
		toh = new Thread(this,msg);
		toh.start();
	}
	//@override
	public void run()
	{
		tob.test(Message);
	}
}
public class Test
{
	public static void main(String args[])
	{
		ThreadC ts=new ThreadC();
		ChildThread ob1=new ChildThread(ts,"Greatest");
		ChildThread ob2=new ChildThread(ts,"cool");
	}
}