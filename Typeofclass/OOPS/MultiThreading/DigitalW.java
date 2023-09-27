class Mythreading extends Thread
{
	public  void run()//run method class ko start()
	{
		for(int i=0,j=0,k=0;k<=59;k++)
		{
			try
			{
		
				System.out.println(i+":"+j+":"+k);
				if(k==59)
				{
					j++;
					k=0;
				}
				else if(j==59)
				{
					i++;
					j=0;
				}
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){}
			}
			catch(Exception e){}
			System.out.print("\r");// "\r"=it moves the cursor to the beginning of the line.
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		Mythreading ob=new Mythreading();
		ob.start();
	}	
}