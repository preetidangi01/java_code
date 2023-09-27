package Pack3;
import Pack2.Volume;
public class Density extends Volume
{
	double d;
	public Density()
	{
		
	}
	public Density(double a,double b,double c,double d)
	{
		super(a,b,c);
		this.d=d;
	}
	public double recDensity()
	{
		return this.d/super.recVolume();
	}
} 