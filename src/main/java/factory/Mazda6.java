/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public class Mazda6 extends Vehicle {
    
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
        this.model = "6";
    }
    
    public void setType() {
        this.type = "Hybrid";
    }
    
    public void setBasePrice() {
        this.basePrice = 17500;
    }
}
