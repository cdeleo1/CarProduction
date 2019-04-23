/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public abstract class Vehicle {
    
    public String model;        // Model
    public String type;         // Type of car (sport, hybrid, or truck)
    public double basePrice;    // Price of car without any customizations
    
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
