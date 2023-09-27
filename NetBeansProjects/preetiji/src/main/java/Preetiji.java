import java.io.*;
class TestRead
{
	public static void main(String args[])throws FileNotFoundException,IOException
	{
		File fobj=new File("FPri.text");
		FileOutputStream fos=new FileOutputStream(fobj);
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.
		dos.writeInt(156);
		dos.writeDouble(35.3);
		dos.writeBoolean(true);
		
		dos.close();
		fos.close();
		
		DataInputStream dis=new DataInputStream(new FileInputStream(fobj));
		System.out.println("Value="+dis.readInt());
		System.out.println("Value="+dis.readByte());
		System.out.println("Value="+dis.readDouble());
		System.out.println("Value="+dis.readBoolean());
	}
}