/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public class HondaCivic extends Vehicle {
    
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
        this.model = "civic";
    }
    
    public void setType() {
        this.type = "sport";
    }
    
    public void setBasePrice() {
        this.basePrice = 18000;
    }
}
