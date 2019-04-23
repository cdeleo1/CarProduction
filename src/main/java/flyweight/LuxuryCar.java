package main.java.flyweight;

public class LuxuryCar extends Car {
    @Override
    public void assignCarRatings() {
        System.out.println("Assigning vehicle ratings to a "+type+" Car...");
        System.out.println("Speed: "+speed);
        System.out.println("Luxury: "+luxury);
        System.out.println("Safety: "+safety);
    }
}
