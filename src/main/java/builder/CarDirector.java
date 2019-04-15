package main.java.builder;


public class CarDirector 
{
	public void MakeCar(CarBuilder carBuilder)
	{
		carBuilder.AddMake();
		carBuilder.AddDealership();
		carBuilder.AddModel();
		carBuilder.AddColor();
		carBuilder.AddVehicleType();
		carBuilder.AddNumCylinders();
		carBuilder.AddCabMaterial();
		carBuilder.AddTransmission();
		carBuilder.AddTireSize();
		carBuilder.AddSpoilerUpgrade();
		carBuilder.AddMufflerUpgrade();
		carBuilder.AddBodyKitUpgrade();
		carBuilder.AddEngineUpgrade();
		
		carBuilder.SetPrice();
	}
}
