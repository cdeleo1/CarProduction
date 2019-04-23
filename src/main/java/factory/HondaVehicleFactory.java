/**
 * Factory Design Pattern
 * SER 316: Assignment 5b
 */
package main.java.factory;

/**
 * @author Cristi DeLeo
 *
 */
public class HondaVehicleFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle(String model) {
        switch(model.toLowerCase()) {
        case "civic":
            return new HondaCivic();
        case "accord":
             return new HondaAccord();
        default:
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Error: Unrecognized model.");
                System.out.println("Options are: Civic or Accord");
                e.printStackTrace();
            }
        }
        return null;
    }
}
