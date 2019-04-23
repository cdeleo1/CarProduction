package main.java.factory;

public class HondaCivic extends Vehicle {
    
    public String model = "civic";      // Model
    public String type = "sport";       // Type of car (sport, hybrid, or truck)
    public double basePrice = 18000;    // Price of car without any customizations
    
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
