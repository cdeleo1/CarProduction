package main.java.builder;

public abstract class CarBuilder 
{
	private Car car = new Car();
	
	public abstract void AddMake();
	public abstract void AddDealership();
	public abstract void AddModel();
	public abstract void AddColor();
	public abstract void AddVehicleType();
	public abstract void AddNumCylinders();
	public abstract void AddCabMaterial();
	public abstract void AddTransmission();
	public abstract void AddTireSize();
	public abstract void AddSpoilerUpgrade();
	public abstract void AddMufflerUpgrade();
	public abstract void AddBodyKitUpgrade();
	public abstract void AddEngineUpgrade();
	
	public abstract void SetPrice();
	public abstract Car GetCar();
}
