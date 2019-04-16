// ConcreteBuilder for CarOrder objects

package main.java.builder;

public class HondaSportsCarOrderBuilder extends CarOrderBuilder {
    private CarOrder carOrder = new CarOrder();

    @Override
    public void AddMake() {
        carOrder.make = "Honda";
    }

    @Override
    public void AddDealership() {
        carOrder.dealership = "Transit Road Honda";
    }

    @Override
    public void AddModel() {
        carOrder.model = "Accord";
    }

    @Override
    public void AddColor() {
        carOrder.color = "Blue";
    }

    @Override
    public void AddVehicleType() {
        carOrder.vehicleType = "Sports Car";
    }

    @Override
    public void AddNumCylinders() {
        carOrder.numCylinders = 4;
    }

    @Override
    public void AddCabMaterial() {
        carOrder.cabMaterial = "Cloth";
    }

    @Override
    public void AddTransmission() {
        carOrder.transmission = "Automatic";
    }

    @Override
    public void AddTireSize() {
        carOrder.tireSize = 22.0;
    }

    @Override
    public void AddSpoilerUpgrade() {
        carOrder.spoilerUpgrade = true;
    }

    @Override
    public void AddMufflerUpgrade() {
        carOrder.mufflerUpgrade = true;
    }

    @Override
    public void AddBodyKitUpgrade() {
        carOrder.bodyKitUpgrade = true;
    }

    @Override
    public void AddEngineUpgrade() {
        carOrder.engineUpgrade = true;
    }

    @Override
    public void SetPrice() {
        carOrder.price = 22000;
    }

    @Override
    public CarOrder GetCar() {
        return carOrder;
    }
}
