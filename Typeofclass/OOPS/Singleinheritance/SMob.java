import java.util.Scanner;
class Mobile
{
	protected String name,color,brand;
	int prize,length,width;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void  setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public void setPrize(int prize)
	{
		this.prize=prize;
	}
}
class Vivo extends Mobile
{
	int version,model_no;
	public void setVerson(int version)
	{
		this.version=version;
	}
	public void setModel_no(int model_no)
	{
		this.model_no=model_no;
	}
	public void display()
	{
		System.out.println("Mobile_Name     :="+name);
		System.out.println("Mobile_Color    :="+color);
		System.out.println("Mobile_brand    :="+brand);
		System.out.println("Mobile_Length   :="+length);
		System.out.println("Mobile_Width    :="+width);
		System.out.println("Mobile_Prize    :="+prize);
		System.out.println("Mobile_Model_no :="+model_no);
		System.out.println("Mobile_Verson   :="+version);
		
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vivo vi=new Vivo();
		vi.setName("Vivo_Y22");
		vi.setColor("Black");
		vi.setBrand("Electronic_cop");
		vi.setLength(5.8);
		vi.setWidth(6.5);
		vi.setPrize(24000);
		vi.setModel_no(4204);
		vi.setVerson(12);
		vi.display();
	}
}