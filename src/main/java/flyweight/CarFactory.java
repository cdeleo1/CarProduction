/**
 * Flyweight Design Pattern
 * SER 316: Assignment 5b
 */
package main.java.flyweight;

import java.util.HashMap;
import java.util.Hashtable;

import main.java.factory.Vehicle;

/**
 * @author Cristi DeLeo
 *
 */
public class CarFactory {

    private HashMap<String, Car> cars = new HashMap<>();
    
    public Car getCar(String type) {
        if(cars.containsKey(type)) {
            return cars.get(type);
        } else {
            Car car = null;
            
            switch(type) {
            case "Sport":
                car = new SportCar();
                car.type = "Sport";
                car.speed = 100;
                car.luxury = 60;
                car.safety = 75;
                break;
            case "Luxury":
                car = new LuxuryCar();
                car.type = "Luxury";
                car.speed = 75;
                car.luxury = 100;
                car.safety = 90;
                break;
            case "SuvCar":
                car = new SuvCar();
                car.type = "SuvCar";
                car.speed = 60;
                car.luxury = 75;
                car.safety = 100;
                break;
            default:
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }   
            }
            
            cars.put(type, car);
            return car;
        }
    }
}
