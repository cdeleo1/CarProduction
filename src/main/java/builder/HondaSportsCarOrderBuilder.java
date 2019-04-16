// ConcreteBuilder for CarOrder objects

package main.java.builder;

public class HondaSportsCarOrderBuilder extends CarOrderBuilder
{
	private CarOrder carOrder = new CarOrder();
	
	@Override
	public void AddMake() { carOrder.Make = "Honda"; }
	
	@Override
	public void AddDealership() { carOrder.Dealership = "Transit Road Honda"; }
	
	@Override
	public void AddModel() { carOrder.Model = "Accord"; }
	
	@Override
	public void AddColor() { carOrder.Color = "Blue"; }
	
	@Override
	public void AddVehicleType() { carOrder.VehicleType = "Sports Car"; }
	
	@Override
	public void AddNumCylinders() { carOrder.NumCylinders = 4; }
	
	@Override
	public void AddCabMaterial() { carOrder.CabMaterial = "Cloth"; }
	
	@Override
	public void AddTransmission() { carOrder.Transmission = "Automatic"; }
	
	@Override
	public void AddTireSize() { carOrder.TireSize = 22.0; }
	
	@Override
	public void AddSpoilerUpgrade() { carOrder.SpoilerUpgrade = true; }
	
	@Override
	public void AddMufflerUpgrade() { carOrder.MufflerUpgrade = true; }
	
	@Override
	public void AddBodyKitUpgrade() { carOrder.BodyKitUpgrade = true; }
	
	@Override
	public void AddEngineUpgrade() { carOrder.EngineUpgrade = true; }
	
	@Override
	public void SetPrice() { carOrder.Price = 22000; }
	
	@Override
	public CarOrder GetCar() { return carOrder; }
}
