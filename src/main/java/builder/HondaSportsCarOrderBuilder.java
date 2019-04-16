// ConcreteBuilder for CarOrder objects

package main.java.builder;

public class HondaSportsCarOrderBuilder extends CarOrderBuilder {
    private CarOrder carOrder = new CarOrder();

    @Override
    public void addMake() {
        carOrder.make = "Honda";
    }

    @Override
    public void addDealership() {
        carOrder.dealership = "Transit Road Honda";
    }

    @Override
    public void addModel() {
        carOrder.model = "Accord";
    }

    @Override
    public void addColor() {
        carOrder.color = "Blue";
    }

    @Override
    public void addVehicleType() {
        carOrder.vehicleType = "Sports Car";
    }

    @Override
    public void addNumCylinders() {
        carOrder.numCylinders = 4;
    }

    @Override
    public void addCabMaterial() {
        carOrder.cabMaterial = "Cloth";
    }

    @Override
    public void addTransmission() {
        carOrder.transmission = "Automatic";
    }

    @Override
    public void addTireSize() {
        carOrder.tireSize = 22.0;
    }

    @Override
    public void addSpoilerUpgrade() {
        carOrder.spoilerUpgrade = true;
    }

    @Override
    public void addMufflerUpgrade() {
        carOrder.mufflerUpgrade = true;
    }

    @Override
    public void addBodyKitUpgrade() {
        carOrder.bodyKitUpgrade = true;
    }

    @Override
    public void addEngineUpgrade() {
        carOrder.engineUpgrade = true;
    }

    @Override
    public void setPrice() {
        carOrder.price = 22000;
    }

    @Override
    public CarOrder getCar() {
        return carOrder;
    }
}
