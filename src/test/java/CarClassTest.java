package test.java;

import static org.junit.Assert.assertTrue;

import main.java.builder.CarOrder;

import org.junit.Before;
import org.junit.Test;



public class CarClassTest {

    CarOrder customCar = new CarOrder();

    @Before
    public void setUp() throws Exception {

        customCar.make = "Mazda";
        customCar.model = "RX8";
        customCar.dealership = "Transit Mazda";
        customCar.color = "Red";
        customCar.vehicleType = "Sport";
        customCar.numCylinders = 0;
        customCar.cabMaterial = "Leather";
        customCar.transmission = "Manual";
        customCar.tireSize = 22.0;
        customCar.price = 22000;
    }

    @Test
    public void testGetMake() {
        String result = customCar.getMake();
        assertTrue(result == "Mazda");
    }

    @Test
    public void testGetModel() {
        String result = customCar.getModel();
        assertTrue(result == "RX8");
    }

    @Test
    public void testGetDealership() {
        String result = customCar.getDealership();
        assertTrue(result == "Transit Mazda");
    }

    @Test
    public void testGetColor() {
        String result = customCar.getColor();
        assertTrue(result == "Red");
    }

    @Test
    public void testGetVehicleType() {
        String result = customCar.getVehicleType();
        assertTrue(result == "Sport");
    }

    @Test
    public void testGetNumCylinders() {
        int result = customCar.getNumCylinders();
        assertTrue(result == 0);
    }

    @Test
    public void testGetCabMaterial() {
        String result = customCar.getCabMaterial();
        assertTrue(result == "Leather");
    }

    @Test
    public void testGetTransmission() {
        String result = customCar.getTransmission();
        assertTrue(result == "Manual");
    }

    @Test
    public void testGetTireSize() {
        double result = customCar.getTireSize();
        assertTrue(result == 22.0);
    }

    @Test
    public void testGetPrice() {
        double result = customCar.getPrice();
        assertTrue(result == 22000);
    }
}
