package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.flyweight.CarType;
import main.java.flyweight.CarTypeFactory;

public class CarTypeClassTest {
    
    CarTypeFactory factory = new CarTypeFactory();
    CarType car = new CarType();

    @Before
    public void setUp() throws Exception {
        car.carData = factory.getCar("Sport");
        car.type = "Sport";
    }

    @Test
    public void testGetType() {
        String result = car.carData.getType();
        assertTrue(result == "Sport");
    }

    @Test
    public void testGetSpeed() {
        int result = car.carData.getSpeed();
        assertTrue(result == 100);
    }

    @Test
    public void testGetLuxury() {
        int result = car.carData.getLuxury();
        assertTrue(result == 60);
    }
    
    @Test
    public void testGetSafety() {
        int result = car.carData.getSafety();
        assertTrue(result == 75);
    }
}
