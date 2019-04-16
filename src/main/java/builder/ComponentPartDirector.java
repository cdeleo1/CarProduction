package main.java.builder;

public class ComponentPartDirector 
{
	public void MakeComponentPart(ComponentPartBuilder componentPartBuilder)
	{
		componentPartBuilder.AddPartType();
		componentPartBuilder.AddID();
		componentPartBuilder.AddManufacturer();
		componentPartBuilder.AddCompatibility();
		componentPartBuilder.AddCost();
		componentPartBuilder.AddIsRequired();
	}
}
