//Home and Temple Conditions
class Home
{
	String Footwear;
	public void setData(String Footwear)
	{
		this.Footwear=Footwear;
	}
	
	public void atHome()
	{
		System.out.println("Take out your "+Footwear+".");
	}
}
class Temple extends Home
{
	private int Person;
	
	public void setData(String Footwear,int Person)
	{
		this.setData(Footwear);
		this.Person=Person;
	}
	
	public void atTemple()
	{
		this.atHome();
		System.out.println(" Now, You "+Person+" Person visit the Temple.");
	}
}

class Test
{
	public static void main(String args[])
	{
		Temple ob = new Temple();
		ob.setData("Shoes",3);
		
		System.out.println("\nPerson at the Gate of Home -->\n");
		ob.atHome();
		System.out.println("\nPerson at the Templs's Gate -->\n");
		ob.atTemple();
	}
}