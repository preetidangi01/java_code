// Addition of two time object
import java.util.Scanner;
class Time
{
	private int h,m,s;
	public void setData(int h,int m,int s)
	{
		this.h=h;
		this.m=m;
		this.s=s;
	}
	public void display()
	{
		System.out.print(" Hours :"+this.h);
		System.out.print(" Minute :"+this.m);
		System.out.println(" Second :"+this.s);
	}
	public void addTime(Time k1,Time k2)
	{
		this.h=k1.h+k2.h;
		this.m=k1.m+k2.m;
		this.s=k1.s+k2.s;
	
		if(this.s>=60 || this.m>=60)
		{
			this.m=this.m+this.s/60;
			this.s=this.s%60;
			this.h=this.h+this.m/60;
			this.m=this.m%60;
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		Time t1=new Time();
		Time t2=new Time();
		Time t3=new Time();
		
		t1.setData(2,45,155);
		t2.setData(3,155,55);
		
		t1.display();
		t2.display();
		t3.addTime(t1,t2);
		t3.display();
		
	}
}