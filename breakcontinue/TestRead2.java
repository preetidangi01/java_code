import java.io.*;
import java.util.Scanner;
class TestRead
{
	public static void main(String args[])throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream(new File("F3.text"));
		int x=fis.read();
			fis.close();
		System.out.println(" "+(char)x);
		FileOutputStream fos=new FileOutputStream("F3.text",true);
		byte arr[]={65,66,67,68,69,70,71,72,73,74,75};
		
		fos.write(arr,3,6);
		fos.flush();
		fos.close();	
	}
}
