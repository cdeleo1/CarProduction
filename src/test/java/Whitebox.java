package test.java;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import main.java.builder.CarDirector;
import main.java.builder.CarBuilder;
import main.java.builder.Car;
import main.java.builder.HondaSportsCarBuilder;

public class Whitebox {

	Car customCar = new Car();
	
	@Before
	public void setUp() throws Exception {
		
		customCar.Make = "Mazda";
		customCar.Model = "RX8";
		customCar.Dealership = "Transit Mazda";
		customCar.Color = "Red";
		customCar.VehicleType = "Sport";
		customCar.NumCylinders = 0;
		customCar.CabMaterial = "Leather";
		customCar.Transmission = "Manual";
		customCar.TireSize = 22.0;
		customCar.Price = 22000;
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
