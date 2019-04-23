package test.java;

import static org.junit.Assert.assertTrue;

import main.java.factory.MazdaVehicleFactory;
import main.java.factory.Vehicle;
import main.java.factory.VehicleFactory;

import org.junit.Before;
import org.junit.Test;

public class VehicleFactoryClassTest {

    VehicleFactory mazdaVehicleFactory = new MazdaVehicleFactory();
    Vehicle mazdaRX8 = mazdaVehicleFactory.createVehicle("rx8");
    Vehicle mazda6 = mazdaVehicleFactory.createVehicle("6");

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetModel() {
        String result1 = mazdaRX8.getModel();
        assertTrue(result1 == "rx8");
        String result2 = mazda6.getModel();
        assertTrue(result2 == "6");
    }

    @Test
    public void testGetType() {
        String result1 = mazdaRX8.getType();
        assertTrue(result1 == "Sport");
        String result2 = mazda6.getType();
        assertTrue(result2 == "Hybrid");
    }

    @Test
    public void testGetBasePrice() {
        double result1 = mazdaRX8.getBasePrice();
        assertTrue(result1 == 20000);
        double result2 = mazda6.getBasePrice();
        assertTrue(result2 == 17500);
    }
}
