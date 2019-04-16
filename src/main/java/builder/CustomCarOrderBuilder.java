package main.java.builder;

import main.java.OrderFrame;

public class CustomCarOrderBuilder extends CarOrderBuilder {
    private CarOrder carOrder = new CarOrder();

    @Override
    public void addMake() {
        carOrder.make = OrderFrame.getMakeSel();
    }

    @Override
    public void addDealership() {
        carOrder.dealership = OrderFrame.getDealerSel();
    }

    @Override
    public void addModel() {
        carOrder.model = OrderFrame.getModelSel();
    }

    @Override
    public void addColor() {
        carOrder.color = OrderFrame.getColorSel();
    }

    @Override
    public void addVehicleType() {
        carOrder.vehicleType = OrderFrame.getVehicleTypeSel();
    }

    @Override
    public void addNumCylinders() {
        carOrder.numCylinders = OrderFrame.getNumCylindersSel();
    }

    @Override
    public void addCabMaterial() {
        carOrder.cabMaterial = OrderFrame.getCabMaterialSel();
    }

    @Override
    public void addTransmission() {
        carOrder.transmission = OrderFrame.getTransmissionSel();
    }

    @Override
    public void addTireSize() {
        carOrder.tireSize = OrderFrame.getTireSizeSel();
    }

    @Override
    public void addSpoilerUpgrade() {
        carOrder.spoilerUpgrade = OrderFrame.getSpoilerUpgradeSel();
    }

    @Override
    public void addMufflerUpgrade() {
        carOrder.mufflerUpgrade = OrderFrame.getMufflerUpgradeSel();
    }

    @Override
    public void addBodyKitUpgrade() {
        carOrder.bodyKitUpgrade = OrderFrame.getBodyKitUpgradeSel();
    }

    @Override
    public void addEngineUpgrade() {
        carOrder.engineUpgrade = OrderFrame.getEngineUpgradeSel();
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
