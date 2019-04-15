package main.java;

import main.java.builder.*;

public class Main 
{
	/** Main method */
	public static void main(String[] args) {
		
		String[][] dealership1Inv = {{"RX8","25"},{"Miata","10"}};
		Dealership dealership1 = new Dealership.DealershipBuilder(
				"Transit", "Mazda", 25, dealership1Inv).build();
		System.out.println(dealership1);
		
		new OrderFrame();	// Opens a GUI for customers to place an order
	}
}