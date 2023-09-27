interface MyInf
{
	public abstract void display();
	void show();
}
public class MyFactorial implements MyInf
{
	public static void main(String ars[])
	{
		MyFactoiral ob=new MyFactorial();
		ob.display();
		ob.show();
	}
}
	//@overrid
	public void display()
	{
		System.out.println("Hello display....");
	
		@overrid
		public show()
		{
			System.out.println("");
		}	
	}
interface  MyInf
	{
	public abstract void display();
	}
	public class MyFactorial
	{
		public static void main(String args[])
		{
			Myinf ref=new MyInf();//Anonymous Inner Classes
			{
				//@override
				public void display()
				{
					System.out.println("Hello display...");
				}
			};
			ref.display();
		}
	}
}