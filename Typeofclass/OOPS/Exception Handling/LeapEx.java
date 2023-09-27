//import java.util.Scanner;
class MyException extends Exception
{
	MyException(){}
	MyException( String mes){
		super(mes);
	}
}
public class Leap
{
    public static void main(String agrs[]) 
	{
		
		try
		{
			if(year%4==0||year%400==0)
			{
				System.out.println("year is leap year :"+year);
			}
			else
			{
				System .out.print("This year is not a leap year :"+year);
			}
		}
		catch(MyException mes)
		{
			System.out.println(mes);
			System.out.println(mes.getMessage());
		}
		
	}
 }