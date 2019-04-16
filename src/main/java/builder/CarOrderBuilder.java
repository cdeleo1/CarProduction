package main.java.builder;

public abstract class CarOrderBuilder {
    public abstract void addMake();

    public abstract void addDealership();

    public abstract void addModel();

    public abstract void addColor();

    public abstract void addVehicleType();

    public abstract void addNumCylinders();

    public abstract void addCabMaterial();

    public abstract void addTransmission();

    public abstract void addTireSize();

    public abstract void addSpoilerUpgrade();

    public abstract void addMufflerUpgrade();

    public abstract void addBodyKitUpgrade();

    public abstract void addEngineUpgrade();

    public abstract void setPrice();

    public abstract CarOrder getCar();
}
