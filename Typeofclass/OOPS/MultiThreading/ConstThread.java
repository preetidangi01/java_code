class Mythreading extends Thread
{
	public Mythreading()
	{
		this.start();
	}
	public Mythreading(String name)
	{
		super(name);
		this.start();
	}
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
		Mythreading	ob=new Mythreading("Firt");
		Mythreading	ob1=new Mythreading("Scond");
		Mythreading	ob2=new Mythreading("Third");
		Mythreading	ob3=new Mythreading("Fourth");
		Mythreading	ob4=new Mythreading("Fifth");
		Mythreading	ob5=new Mythreading("Sixth");
		Mythreading	ob6=new Mythreading("Seventh");
		Mythreading	ob7=new Mythreading("Eeighth");
		Mythreading	ob8=new Mythreading("Ninth");
		Mythreading	ob9=new Mythreading("Tenth"); 
		

		ob.setName("First");
		ob1.setName("Second");
		

	}	
}