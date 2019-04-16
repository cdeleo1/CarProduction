package main.java.builder;

import main.java.OrderFrame;

public class CustomCarOrderBuilder extends CarOrderBuilder
{
	private CarOrder carOrder = new CarOrder();
	
	@Override
	public void AddMake() { carOrder.Make = OrderFrame.getMakeSel(); }
	
	@Override
	public void AddDealership() { carOrder.Dealership = OrderFrame.getDealerSel(); }
	
	@Override
	public void AddModel() { carOrder.Model = OrderFrame.getModelSel(); }
	
	@Override
	public void AddColor() { carOrder.Color = OrderFrame.getColorSel(); }
	
	@Override
	public void AddVehicleType() { carOrder.VehicleType = OrderFrame.getVehicleTypeSel(); }
	
	@Override
	public void AddNumCylinders() { carOrder.NumCylinders = OrderFrame.getNumCylindersSel(); }
	
	@Override
	public void AddCabMaterial() { carOrder.CabMaterial = OrderFrame.getCabMaterialSel(); }
	
	@Override
	public void AddTransmission() { carOrder.Transmission = OrderFrame.getTransmissionSel(); }
	
	@Override
	public void AddTireSize() { carOrder.TireSize = OrderFrame.getTireSizeSel(); }
	
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
