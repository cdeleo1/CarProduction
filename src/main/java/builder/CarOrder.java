package main.java.builder;

public class CarOrder {
    public String make; // Required
    public String model; // Required
    public String dealership; // Required
    public String color; // Required
    public String vehicleType; // Required
    public int numCylinders; // Required
    public String cabMaterial; // Required
    public String transmission; // Required
    public double tireSize; // Required
    public Boolean spoilerUpgrade; // Optional
    public Boolean mufflerUpgrade; // Optional
    public Boolean bodyKitUpgrade; // Optional
    public Boolean engineUpgrade; // Optional

    public double Price; // Required

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getDealership() {
        return this.dealership;
    }

    public String getColor() {
        return this.color;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public int getNumCylinders() {
        return this.numCylinders;
    }

    public String getCabMaterial() {
        return this.cabMaterial;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public double getTireSize() {
        return this.tireSize;
    }

    public Boolean getSpoilerUpgrade() {
        return this.spoilerUpgrade;
    }

    public Boolean getMufflerUpgrade() {
        return this.mufflerUpgrade;
    }

    public Boolean getBodyKitUpgrade() {
        return this.bodyKitUpgrade;
    }

    public Boolean getEngineUpgrade() {
        return this.engineUpgrade;
    }

    public double getPrice() {
        return this.Price;
    }

    public void setMake(String Make) {
        this.make = Make;
    }

    public void setModel(String Model) {
        this.model = Model;
    }

    public void setDealership(String Dealership) {
        this.dealership = Dealership;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public void setVehicleType(String VehicleType) {
        this.vehicleType = VehicleType;
    }

    public void setNumCylinders(int NumCylinders) {
        this.numCylinders = NumCylinders;
    }

    public void setCabMaterial(String CabMaterial) {
        this.cabMaterial = CabMaterial;
    }

    public void setTransmission(String Transmission) {
        this.transmission = Transmission;
    }

    public void setTireSize(double TireSize) {
        this.tireSize = TireSize;
    }

    public void setSpoilerUpgrade(Boolean SpoilerUpgrade) {
        this.spoilerUpgrade = SpoilerUpgrade;
    }

    public void setMufflerUpgrade(Boolean MufflerUpgrade) {
        this.mufflerUpgrade = MufflerUpgrade;
    }

    public void setBodyKitUpgrade(Boolean BodyKitUpgrade) {
        this.bodyKitUpgrade = BodyKitUpgrade;
    }

    public void setEngineUpgrade(Boolean EngineUpgrade) {
        this.engineUpgrade = EngineUpgrade;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "dealership: " + this.dealership + " | Car Order details: " + this.make + " " + this.model + " | color: "
                + this.color + " | Classification: " + this.vehicleType + " | Engine: " + this.numCylinders
                + " | transmission: " + this.transmission + " | Interior: " + this.cabMaterial + " | Tire size: "
                + this.tireSize + " | Spoiler upgrade: " + this.spoilerUpgrade + " | Muffler upgrade: "
                + this.mufflerUpgrade + " | Body kit upgrade: " + this.bodyKitUpgrade + " | Engine upgrade: "
                + this.engineUpgrade;
    }
}
