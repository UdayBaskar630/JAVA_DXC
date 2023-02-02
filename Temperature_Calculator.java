package DXC;

class Temperature_Calculator
{
	private double ftemp;
	private double Celsius;
	private double Kelvin;
	
	public void Temperature(double ftemp)
	{
	this.ftemp = ftemp;
	}
	
	public double getFahrenheit()
	{
	return ftemp;	
	}
	
	public void setFahrenheit(double ftemp)
	{
	this.ftemp = ftemp;
	}
	
	public  double getCelsius(double ftemp)
	{
		Celsius = (5/9.0)*(ftemp-32);
		return Celsius;
	}
	public double getKelvin(double ftemp)
	{
		Kelvin = ((5/9.0)*(ftemp-32))+273;
		return Kelvin;
	}
	


public static void main(String[] args)
	{
	Temperature_Calculator t2 = new Temperature_Calculator ();
	System.out.println(t2.getCelsius(45));
	System.out.println(t2.getKelvin(69));
	}
}







