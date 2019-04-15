package main.java.builder;

import main.java.OrderFrame;
import main.java.Main;

public class CustomCarBuilder extends CarBuilder
{
	private Car car = new Car();
	
	@Override
	public void AddMake() { car.Make = OrderFrame.makeSel; }
	
	@Override
	public void AddDealership() 
	{
		int i, j;
		
		j = 1; // Column containing the Make/Manufacturer
		
		for(i=0; i < Main.allDealersInventory.length; i++)
		{
			if(car.Make == Main.allDealersInventory[i][0])
			{
				car.Dealership = Main.allDealersInventory[i][0];
			}
		}
	}
	
	@Override
	public void AddModel() { car.Model = OrderFrame.modelSel; }
	
	@Override
	public void AddColor() { car.Color = OrderFrame.colorSel; }
	
	@Override
	public void AddVehicleType() { car.VehicleType = OrderFrame.vehicleTypeSel; }
	
	@Override
	public void AddNumCylinders() { car.NumCylinders = OrderFrame.numCylindersSel; }
	
	@Override
	public void AddCabMaterial() { car.CabMaterial = OrderFrame.cabMaterialSel; }
	
	@Override
	public void AddTransmission() { car.Transmission = OrderFrame.transmissionSel; }
	
	@Override
	public void AddTireSize() { car.TireSize = OrderFrame.tireSizeSel; }
	
	@Override
	public void AddSpoilerUpgrade() { car.SpoilerUpgrade = OrderFrame.spoilerUpgradeSel; }
	
	@Override
	public void AddMufflerUpgrade() { car.MufflerUpgrade = OrderFrame.mufflerUpgradeSel; }
	
	@Override
	public void AddBodyKitUpgrade() { car.BodyKitUpgrade = OrderFrame.bodyKitUpgradeSel; }
	
	@Override
	public void AddEngineUpgrade() { car.EngineUpgrade = OrderFrame.engineUpgradeSel; }
	
	@Override
	public void SetPrice() 
	{ 
		car.Price = 22000; }
	
	@Override
	public Car GetCar() { return car; }
}
