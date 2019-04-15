package main.java;

import main.java.builder.*;

public class Main 
{
	public static String[][] allDealersInventory = {{"Transit", "Mazda", "RX8", "25"},
													{"Transit", "Mazda", "Miata", "10"},
													{"Transit", "Honda", "Accord", "17"},
													{"Transit", "Honda", "Civic", "12"}};

	/** Main method */
	public static void main(String[] args) {
		
		String[][] mazdaDealerInventory = { {"Mazda", "RX8", "25"},
								  			{"Mazda", "Miata", "17"}};
		String[][] hondaDealerInventory = { {"Honda", "Accord", "25"},
				  							{"Honda", "Civic", "12"}};
		
		Dealership mazdaDealer = new Dealership.DealershipBuilder(
				"Transit", "Mazda", 25, mazdaDealerInventory).build();
		Dealership hondaDealer = new Dealership.DealershipBuilder(
				"Union", "Honda", 30, hondaDealerInventory).build();
		
		System.out.println(mazdaDealer);
		System.out.println(hondaDealer);
		
		new OrderFrame();	// Opens a GUI for customers to place an order
		
		// Demonstration of the Builder Pattern
		CarDirector carDirector = new CarDirector();
		CarBuilder hondaSportsCarBuilder = new HondaSportsCarBuilder();
		carDirector.MakeCar(hondaSportsCarBuilder);
		Car sportsCar = hondaSportsCarBuilder.GetCar();
		System.out.println(sportsCar);
		System.out.println();
	}
}