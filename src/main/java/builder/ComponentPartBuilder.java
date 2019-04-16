package main.java.builder;

import main.java.OrderFrame;

public abstract class ComponentPartBuilder 
{
	private ComponentPart componentPart = new ComponentPart();
	
	public abstract void AddPartType();
	public abstract void AddID();
	public abstract void AddManufacturer();
	public abstract void AddCompatibility();
	public abstract void AddCost();
	public abstract void AddIsRequired();

	public abstract ComponentPart GetComponentPart();
}

