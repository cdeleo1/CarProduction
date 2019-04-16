package main.java.builder;

public abstract class ComponentPartBuilder 
{
	public abstract void AddPartType();
	public abstract void AddID();
	public abstract void AddManufacturer();
	public abstract void AddCompatibility();
	public abstract void AddCost();
	public abstract void AddIsRequired();

	public abstract ComponentPart GetComponentPart();
}

