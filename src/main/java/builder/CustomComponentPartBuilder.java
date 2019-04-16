package main.java.builder;

import main.java.Main;

public class CustomComponentPartBuilder extends ComponentPartBuilder
{
	private ComponentPart customComponentPart = new ComponentPart();

	@Override
	public void AddPartType() { customComponentPart.PartType = Main.componentPartData[0][0]; }

	@Override
	public void AddID() { customComponentPart.ID = Main.componentPartData[0][1];; }

	@Override
	public void AddManufacturer() { customComponentPart.Manufacturer = Main.componentPartData[0][2]; }

	@Override
	public void AddCompatibility() { customComponentPart.Compatibility[0] = Main.componentPartData[0][3]; }

	@Override
	public void AddCost() { customComponentPart.Cost = Main.componentPartData[0][4]; }

	@Override
	public void AddIsRequired() { customComponentPart.IsRequired = Main.componentPartData[0][5]; }
	
	@Override
	public ComponentPart GetComponentPart() { return customComponentPart; }
}