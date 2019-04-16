package main.java.builder;

import main.java.OrderFrame;

public class CustomCarOrderBuilder extends CarOrderBuilder {
    private CarOrder carOrder = new CarOrder();

    @Override
    public void AddMake() {
        carOrder.make = OrderFrame.getMakeSel();
    }

    @Override
    public void AddDealership() {
        carOrder.dealership = OrderFrame.getDealerSel();
    }

    @Override
    public void AddModel() {
        carOrder.model = OrderFrame.getModelSel();
    }

    @Override
    public void AddColor() {
        carOrder.color = OrderFrame.getColorSel();
    }

    @Override
    public void AddVehicleType() {
        carOrder.vehicleType = OrderFrame.getVehicleTypeSel();
    }

    @Override
    public void AddNumCylinders() {
        carOrder.numCylinders = OrderFrame.getNumCylindersSel();
    }

    @Override
    public void AddCabMaterial() {
        carOrder.cabMaterial = OrderFrame.getCabMaterialSel();
    }

    @Override
    public void AddTransmission() {
        carOrder.transmission = OrderFrame.getTransmissionSel();
    }

    @Override
    public void AddTireSize() {
        carOrder.tireSize = OrderFrame.getTireSizeSel();
    }

    @Override
    public void AddSpoilerUpgrade() {
        carOrder.spoilerUpgrade = OrderFrame.getSpoilerUpgradeSel();
    }

    @Override
    public void AddMufflerUpgrade() {
        carOrder.mufflerUpgrade = OrderFrame.getMufflerUpgradeSel();
    }

    @Override
    public void AddBodyKitUpgrade() {
        carOrder.bodyKitUpgrade = OrderFrame.getBodyKitUpgradeSel();
    }

    @Override
    public void AddEngineUpgrade() {
        carOrder.engineUpgrade = OrderFrame.getEngineUpgradeSel();
    }

    @Override
    public void SetPrice() {
        carOrder.Price = 22000;
    }

    @Override
    public CarOrder GetCar() {
        return carOrder;
    }
}
