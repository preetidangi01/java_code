package Pack2;

import Pack1.Area;
public class Volume extends Area
{
	double c;
	public Volume()
	{}
	public Volume(double a,double b,double c)
	{
		super(a,b);
		this.c=c;
	}
	public double recVolume()
	{
		return super.recArea()*this.c;
		//System.out.println("Volume is="+sum);
	}
}