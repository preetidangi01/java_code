class Mythreading extends Thread
{
	public  void run()//run method class ko start()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(this.getName()+"="+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		Mythreading	 ob=new Mythreading();
		Mythreading	ob1=new Mythreading();
		Mythreading	ob2=new Mythreading();
		Mythreading	ob3=new Mythreading();
		Mythreading	ob4=new Mythreading();
		Mythreading	ob5=new Mythreading();
		Mythreading	ob6=new Mythreading();
		Mythreading	ob7=new Mythreading();
		Mythreading	ob8=new Mythreading();
		Mythreading	ob9=new Mythreading();
				
		ob.start();
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
		ob5.start();
		ob6.start();
		ob7.start();
		ob8.start();
		ob9.start();
	}	
}