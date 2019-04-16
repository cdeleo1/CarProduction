package main.java.builder;

import main.java.OrderFrame;

public class CustomCarOrderBuilder extends CarOrderBuilder
{
	private CarOrder carOrder = new CarOrder();
	
	@Override
	public void AddMake() { carOrder.Make = OrderFrame.makeSel; }
	
	@Override
	public void AddDealership() { carOrder.Dealership = OrderFrame.dealerSel; }
	
	@Override
	public void AddModel() { carOrder.Model = OrderFrame.modelSel; }
	
	@Override
	public void AddColor() { carOrder.Color = OrderFrame.colorSel; }
	
	@Override
	public void AddVehicleType() { carOrder.VehicleType = OrderFrame.vehicleTypeSel; }
	
	@Override
	public void AddNumCylinders() { carOrder.NumCylinders = OrderFrame.numCylindersSel; }
	
	@Override
	public void AddCabMaterial() { carOrder.CabMaterial = OrderFrame.cabMaterialSel; }
	
	@Override
	public void AddTransmission() { carOrder.Transmission = OrderFrame.transmissionSel; }
	
	@Override
	public void AddTireSize() { carOrder.TireSize = OrderFrame.tireSizeSel; }
	
	@Override
	public void AddSpoilerUpgrade() { carOrder.SpoilerUpgrade = OrderFrame.getSpoilerUpgradeSel(); }
	
	@Override
	public void AddMufflerUpgrade() { carOrder.MufflerUpgrade = OrderFrame.getMufflerUpgradeSel(); }
	
	@Override
	public void AddBodyKitUpgrade() { carOrder.BodyKitUpgrade = OrderFrame.getBodyKitUpgradeSel(); }
	
	@Override
	public void AddEngineUpgrade() { carOrder.EngineUpgrade = OrderFrame.getEngineUpgradeSel(); }
	
	@Override
	public void SetPrice() 
	{ 
		carOrder.Price = 22000; }
	
	@Override
	public CarOrder GetCar() { return carOrder; }
}
