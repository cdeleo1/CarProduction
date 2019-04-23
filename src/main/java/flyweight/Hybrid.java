/**
 * Flyweight Design Pattern
 * SER 316: Assignment 5b
 */

package main.java.flyweight;

public class Hybrid extends Car {
    @Override
    public void assignCarRatings() {
        System.out.println("Assigning vehicle ratings to a " + type + " ...");
        System.out.println("Speed: " + speed);
        System.out.println("Luxury: " + luxury);
        System.out.println("Safety: " + safety);
    }
}
