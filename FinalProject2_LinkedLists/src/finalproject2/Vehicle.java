package finalproject2;
//David Shenouda
//5/6/21
//CSIS 237-90
public class Vehicle {
	private String VIN;
	private String Type;
	private double MSRP;
	private String Make;
	private String Model;
	private int ModelYear;
	
	//Default Constructor
	public Vehicle()
	{
		VIN = "";
		Type = "";
		MSRP = 0.0;
		Make = "";
		Model = "";
		ModelYear = 0;
		
	}
	
	//Alt Constructor
	public Vehicle(String VIN, String Type)
	{
		this.VIN = VIN;
		this.Type = Type;
		MSRP = 0.0;
		Make = "";
		Model = "";
		ModelYear = 0;
	}
	
	//User Operated Constructor
	public Vehicle(String VIN, String Type, double MSRP, String Make, String Model, int ModelYear)
	{
		this.VIN = VIN;
		this.Type = Type;
		this.MSRP = MSRP;
		this.Make = Make;
		this.Model = Model;
		this.ModelYear = ModelYear;
	}
	
	//to String Method returns the string of class Vehicle
	public String toString()
	{
		return "\nType: " + Type + "\nVIN: " + VIN + "\nMSRP: $" + MSRP +
				"\nMake: " + Make + "\nModel: " +  Model + "\nModel Year: " + ModelYear;
	}
	
	//Setters in Vehicle class
	public void setVIN (String VIN)
	{
		this.VIN = VIN;
	}
	
	public void setType (String Type)
	{
		this.Type = Type;
	}
	
	public void setMSRP (double MSRP)
	{
		this.MSRP = MSRP;
	}
	
	public void setMake (String Make)
	{
		this.Make = Make;
	}
	
	public void setModel (String Model)
	{
		this.Model = Model;
	}
	
	public void setModelYear (int ModelYear)
	{
		this.ModelYear = ModelYear;
	}
	
	
	//Getters in Vehicle class
	public String getVIN ()
	{
		return VIN;
	}
	
	public String getType()
	{
		return Type;
	}
	
	public double getMSRP()
	{
		return MSRP;
	}
	
	public String getMake ()
	{
		return Make;
	}
	
	public String getModel ()
	{
		return Model;
	}
	
	public int getModelYear ()
	{
		return ModelYear;
	}
	
	
}
