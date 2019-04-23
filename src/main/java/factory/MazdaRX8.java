/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public class MazdaRX8 extends Vehicle {
    
    public String model = "rx8";        // Model
    public String type = "Sport";       // Type of car (sport, hybrid, or truck)
    public double basePrice = 20000;    // Price of car without any customizations
    
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
