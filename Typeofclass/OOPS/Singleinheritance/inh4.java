// Index Pages and Main Content written pages.
import java.util.Scanner;
class Index
{
    int i;
	public void setData(int i)
	{
		this.i=i;
	}
	
	public void indexPages()
	{
		System.out.println(" Number of Index Pages : "+i);
	}
}

class Book extends Index
{
    private int c;
	public void setData(int i,int c)
	{
		this.setData(i);
		this.c=c;
	}
	
	public void bookPages()
	{
		this.indexPages();
		System.out.println(" Number of Main Content Pages : "+c);
		System.out.println(" Total Number Pages in Book : "+(i+c));
	}
}

class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Book ob = new Book();
		
		System.out.print("Enter Number of Index Pages : ");
        int i = sc.nextInt();
		System.out.print("Enter Number of Content Pages : ");
        int c = sc.nextInt();
		
		ob.setData(i,c);
		System.out.print("\nIndex Pages Details -->\n");
        ob.indexPages();
		System.out.print("\nBook Pages Details -->\n");
        ob.bookPages();
	}
}