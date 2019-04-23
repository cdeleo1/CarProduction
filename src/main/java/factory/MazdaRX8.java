/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.factory;

public class MazdaRX8 extends Vehicle {
    
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
        this.model = "rx8";
    }
    
    public void setType() {
        this.type = "Sport";
    }
    
    public void setBasePrice() {
        this.basePrice = 20000;
    }
}
