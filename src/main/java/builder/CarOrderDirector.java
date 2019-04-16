package main.java.builder;

public class CarOrderDirector {
	public void makeCar(CarOrderBuilder carOrderBuilder) {
		System.out.println("BEGIN CAR ORDER BUILDER: ");
		System.out.println("------------------------");

		System.out.println("Adding Make...");
		carOrderBuilder.AddMake();
		System.out.println("Adding Dealership...");
		carOrderBuilder.AddDealership();
		System.out.println("Adding Model...");
		carOrderBuilder.AddModel();
		System.out.println("Adding Color...");
		carOrderBuilder.AddColor();
		System.out.println("Adding Vehicle Type...");
		carOrderBuilder.AddVehicleType();
		System.out.println("Adding Number of Cylinders...");
		carOrderBuilder.AddNumCylinders();
		System.out.println("Adding Cab Material...");
		carOrderBuilder.AddCabMaterial();
		System.out.println("Adding Transmission...");
		carOrderBuilder.AddTransmission();
		System.out.println("Adding Tire Size...");
		carOrderBuilder.AddTireSize();
		System.out.println("Adding Spoiler Upgrade...");
		carOrderBuilder.AddSpoilerUpgrade();
		System.out.println("Adding Muffler Upgrade...");
		carOrderBuilder.AddMufflerUpgrade();
		System.out.println("Adding Body Kit Upgrade...");
		carOrderBuilder.AddBodyKitUpgrade();
		System.out.println("Adding Engine Upgrade...");
		carOrderBuilder.AddEngineUpgrade();
		System.out.println("Setting Price...");
		carOrderBuilder.SetPrice();
	}
}
