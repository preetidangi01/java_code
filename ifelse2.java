/* 0-12-->child
13-19-->teenager
20-64-->adult
65 and above -->senior */
import java.util.Scanner;
class Ram
{	
	int x=10;
	class Inner
	{
		int x=100;
		public void meeee()
		{
		    int x=1000;
			System.out.println(this.x);
			System.out.println(x);
			System.out.println(Ram.this.x);
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		new Ram().new Inner().meeee();
	}
}