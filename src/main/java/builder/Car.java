package main.java.builder;

public class Car 
{
	public String Make;				// Required
	public String Model; 			// Required
	public String Dealership;		// Required
	public String Color; 			// Required
	public String VehicleType;		// Required
	public int NumCylinders;		// Required
	public String CabMaterial;		// Required
	public String Transmission;		// Required
	public double TireSize;			// Required
	public Boolean SpoilerUpgrade;	// Optional
	public Boolean MufflerUpgrade;	// Optional
	public Boolean BodyKitUpgrade;	// Optional
	public Boolean EngineUpgrade;	// Optional
	
	public double Price;			// Required
	
	public String getMake()				{ return this.Make; }
	public String getModel()			{ return this.Model; }
	public String getDealership()		{ return this.Dealership; }
	public String getColor()			{ return this.Color; }
	public String getVehicleType()		{ return this.VehicleType; }
	public int getNumCylinders()		{ return this.NumCylinders; }
	public String getCabMaterial()		{ return this.CabMaterial; }
	public String getTransmission()		{ return this.Transmission; }
	public double getTireSize()			{ return this.TireSize; }
	public Boolean getSpoilerUpgrade()	{ return this.SpoilerUpgrade; }
	public Boolean getMufflerUpgrade()	{ return this.MufflerUpgrade; }
	public Boolean getBodyKitUpgrade()	{ return this.BodyKitUpgrade; }
	public Boolean getEngineUpgrade()	{ return this.EngineUpgrade; }
	
	public void setMake(String Make)						{ this.Make = Make; }
	public void setModel(String Model)						{ this.Model = Model; }
	public void setDealership(String Dealership)			{ this.Dealership = Dealership; }
	public void setColor(String Color)						{ this.Color = Color; }
	public void setVehicleType(String VehicleType)			{ this.VehicleType = VehicleType; }
	public void setNumCylinders(int NumCylinders)			{ this.NumCylinders = NumCylinders; }
	public void setCabMaterial(String CabMaterial)			{ this.CabMaterial = CabMaterial; }
	public void setTransmission(String Transmission)		{ this.Transmission = Transmission; }
	public void setTireSize(double TireSize)				{ this.TireSize = TireSize; }
	public void setSpoilerUpgrade(Boolean SpoilerUpgrade)	{ this.SpoilerUpgrade = SpoilerUpgrade; }
	public void setMufflerUpgrade(Boolean MufflerUpgrade)	{ this.MufflerUpgrade = MufflerUpgrade; }
	public void setBodyKitUpgrade(Boolean BodyKitUpgrade)	{ this.BodyKitUpgrade = BodyKitUpgrade; }
	public void setEngineUpgrade(Boolean EngineUpgrade)		{ this.EngineUpgrade = EngineUpgrade; }
	
	@Override
	public String toString()
	{
		return "Dealership: "+this.Dealership+" | Car details: "+this.Make+" "+this.Model+" | Color: "+this.Color+
				" | Classification: "+this.VehicleType+" | Engine: "+this.NumCylinders+
				" | Transmission: "+this.Transmission+" | Interior: "+this.CabMaterial+
				" | Tire size: "+this.TireSize+" | Spoiler upgrade: "+this.SpoilerUpgrade+
				" | Muffler upgrade: "+this.MufflerUpgrade+" | Body kit upgrade: "+
				this.BodyKitUpgrade+" | Engine upgrade: "+this.EngineUpgrade;
	}
}
