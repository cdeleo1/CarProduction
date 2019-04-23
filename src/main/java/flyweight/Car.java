/**
 * Flyweight Design Pattern
 * SER 316: Assignment 5b
 */
package main.java.flyweight;

import main.java.factory.Vehicle;

/**
 * @author Cristi DeLeo
 *
 */
public abstract class Car {
    
    public String type;     // Type of vehicle (sports car, sedan, truck, Truck, etc.)
    public int speed;       // Speed rating
    public int luxury;      // Luxury rating
    public int safety;      // Safety rating
    
    public String getType() {
        return this.type;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public int getLuxury() {
        return this.luxury;
    }
    
    public int getSafety() {
        return this.safety;
    }
    
    public void setType() {
        this.type = type;
    }
    
    public void setSpeed() {
        this.speed = speed;
    }
    
    public void setLuxury() {
        this.luxury = luxury;
    }
    
    public void setSafety() {
        this.safety = safety;
    }
    
    public abstract void assignCarRatings();
}
