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

    public double price; // Required

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
        return this.price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDealership(String dealership) {
        this.dealership = dealership;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public void setCabMaterial(String cabMaterial) {
        this.cabMaterial = cabMaterial;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setTireSize(double TireSize) {
        this.tireSize = TireSize;
    }

    public void setSpoilerUpgrade(Boolean spoilerUpgrade) {
        this.spoilerUpgrade = spoilerUpgrade;
    }

    public void setMufflerUpgrade(Boolean mufflerUpgrade) {
        this.mufflerUpgrade = mufflerUpgrade;
    }

    public void setBodyKitUpgrade(Boolean bodyKitUpgrade) {
        this.bodyKitUpgrade = bodyKitUpgrade;
    }

    public void setEngineUpgrade(Boolean engineUpgrade) {
        this.engineUpgrade = engineUpgrade;
    }

    public void setPrice(double price) {
        this.price = price;
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
