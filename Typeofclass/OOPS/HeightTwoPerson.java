import java.util.Scanner;
class Height
{
	private int f,i;
	private Scanner sc=new Scanner(System.in);
	public void setData()
	{
		System.out.println("Enter Height in Feet :");
		int f=sc.nextInt();
		System.out.println("Enter Height in Inch :");
		int i=sc.nextInt();
		this.f=f;
		this.i=i;
	}
	public void display()
	{
		System.out.println(this.f+" Feet "+this.i+" inch ");
	}
	public void addHeight(Height k1, Height k2)
	{
		this.f=k1.f+k2.f;
		this.i=k1.i+k2.i;
		
		if(i>=12)
		{
			this.f=this.f+this.i/12;
			this.i=this.i%12;
		}	
	}
}
class Test
{
	public static void main(String args[])
	{
		Height h1=new Height();
		Height h2=new Height();
		Height h3=new Height();
		h1.setData();
		h2.setData();
		h1.display();
		h2.display();
		h3.addHeight(h1,h2);
		h3.display();
	}
}