package differential;

public class Differential_lib implements Differential_if
{
	private double a , h;
	
	Differential_lib( double a , double h )
	{
		this.a = a;
		this.h = h;
	}
	
	@Override
	public double getRx() 
	{
		return 2 * this.a;
	}

	@Override
	public double getDx() 
	{
		return ( Math.pow( this.a + this.h , 2.0 ) - Math.pow( this.a , 2 ) ) / this.h;
	}
}
