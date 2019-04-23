/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public class HondaAccord extends Vehicle {
    
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
        this.model = "accord";
    }
    
    public void setType() {
        this.type = "hybrid";
    }
    
    public void setBasePrice() {
        this.basePrice = 15000;
    }
}
