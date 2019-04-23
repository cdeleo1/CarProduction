/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */
package main.java.factory;

/**
 * @author Cristi DeLeo
 *
 */
public class MazdaVehicleFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle(String model) {
        switch(model.toLowerCase()) {
        case "rx8":
            return new MazdaRX8();
        case "6":
             return new Mazda6();
        default:
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Error: Unrecognized model.");
                System.out.println("Options are: RX8 or 6");
                e.printStackTrace();
            }
        }
        return null;
    }
}
