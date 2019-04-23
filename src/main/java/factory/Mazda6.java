package main.java.factory;

public class Mazda6 extends Vehicle {
    
    public String model = "6";          // Model
    public String type = "Hybrid";      // Type of car (sport, hybrid, or truck)
    public double basePrice = 17500;    // Price of car without any customizations
    
    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }
    
    public double getBasePrice() {
        return this.basePrice;
    }
    
    public void setModel() {
        this.model = model;
    }
    
    public void setType() {
        this.type = type;
    }
    
    public void setBasePrice() {
        this.basePrice = basePrice;
    }

}
