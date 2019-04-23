/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public class MazdaRX8 extends Vehicle {
    
    public MazdaRX8() {
        model = "rx8";
        type = "Sport";
        basePrice = 20000;
    }
    
    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }
    
    public double getBasePrice() {
        return this.basePrice;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
