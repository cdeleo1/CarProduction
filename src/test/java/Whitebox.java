package test.java;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import main.java.builder.*;
import main.java.builder.CarOld.CarBuilder;

public class Whitebox {
	
	CarOld basicCar;
	
	@Before
	public void setUp() throws Exception {
		
		basicCar = new CarBuilder("Mazda", "RX8", 
        		"Transit Mazda", "Red", "Sport", 0, "Leather", "Manual", 22.0)
				.build();
	}
	
	@Test
	public void testGetMake() {
		String result = basicCar.getMake();
		assertTrue(result == "Mazda");
	}
	
	@Test
	public void testGetModel() {
		String result = basicCar.getModel();
		assertTrue(result == "RX8");
	}
	
	@Test
	public void testGetDealership() {
		String result = basicCar.getDealership();
		assertTrue(result == "Transit Mazda");
	}
	
	@Test
	public void testGetColor() {
		String result = basicCar.getColor();
		assertTrue(result == "Red");
	}
	
	@Test
	public void testGetVehicleType() {
		String result = basicCar.getVehicleType();
		assertTrue(result == "Sport");
	}
	
	@Test
	public void testGetNumCylinders() {
		int result = basicCar.getNumCylinders();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetCabMaterial() {
		String result = basicCar.getCabMaterial();
		assertTrue(result == "Leather");
	}
	
	@Test
	public void testGetTransmission() {
		String result = basicCar.getTransmission();
		assertTrue(result == "Manual");
	}
	
	@Test
	public void testGetTireSize() {
		double result = basicCar.getTireSize();
		assertTrue(result == 22.0);
	}
}
