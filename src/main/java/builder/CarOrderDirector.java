package main.java.builder;

public class CarOrderDirector {
    public void makeCar(CarOrderBuilder carOrderBuilder) {
        System.out.println("BEGIN CAR ORDER BUILDER: ");
        System.out.println("------------------------");

        System.out.println("Adding make...");
        carOrderBuilder.addMake();
        System.out.println("Adding dealership...");
        carOrderBuilder.addDealership();
        System.out.println("Adding model...");
        carOrderBuilder.addModel();
        System.out.println("Adding color...");
        carOrderBuilder.addColor();
        System.out.println("Adding Vehicle Type...");
        carOrderBuilder.addVehicleType();
        System.out.println("Adding Number of Cylinders...");
        carOrderBuilder.addNumCylinders();
        System.out.println("Adding Cab Material...");
        carOrderBuilder.addCabMaterial();
        System.out.println("Adding transmission...");
        carOrderBuilder.addTransmission();
        System.out.println("Adding Tire Size...");
        carOrderBuilder.addTireSize();
        System.out.println("Adding Spoiler Upgrade...");
        carOrderBuilder.addSpoilerUpgrade();
        System.out.println("Adding Muffler Upgrade...");
        carOrderBuilder.addMufflerUpgrade();
        System.out.println("Adding Body Kit Upgrade...");
        carOrderBuilder.addBodyKitUpgrade();
        System.out.println("Adding Engine Upgrade...");
        carOrderBuilder.addEngineUpgrade();
        System.out.println("Setting price...");
        carOrderBuilder.setPrice();
    }
}
