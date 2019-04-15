// ConcreteBuilder for Car objects

package main.java.builder;

public class HondaSportsCarBuilder extends CarBuilder
{
	private Car car = new Car();
	
	@Override
	public void AddMake() { car.Make = "Honda"; }
	
	@Override
	public void AddDealership() { car.Dealership = "Transit Road Honda"; }
	
	@Override
	public void AddModel() { car.Model = "Accord"; }
	
	@Override
	public void AddColor() { car.Color = "Accord"; }
	
	@Override
	public void AddVehicleType() { car.VehicleType = "Accord"; }
	
	@Override
	public void AddNumCylinders() { car.NumCylinders = 4; }
	
	@Override
	public void AddCabMaterial() { car.CabMaterial = "Accord"; }
	
	@Override
	public void AddTransmission() { car.Transmission = "Accord"; }
	
	@Override
	public void AddTireSize() { car.TireSize = 22.0; }
	
	@Override
	public void AddSpoilerUpgrade() { car.SpoilerUpgrade = true; }
	
	@Override
	public void AddMufflerUpgrade() { car.MufflerUpgrade = true; }
	
	@Override
	public void AddBodyKitUpgrade() { car.BodyKitUpgrade = true; }
	
	@Override
	public void AddEngineUpgrade() { car.EngineUpgrade = true; }
	
	@Override
	public void SetPrice() { car.Price = 22000; }
	
	@Override
	public Car GetCar() { return car; }
}
