/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public class HondaAccord extends Vehicle {
    
    public String model = "accord";      // Model
    public String type = "hybrid";       // Type of car (sport, hybrid, or truck)
    public double basePrice = 15000;     // Price of car without any customizations
    
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
