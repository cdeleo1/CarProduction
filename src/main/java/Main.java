package main.java;

import main.java.builder.*;

public class Main {
	
	// Very basic 2D array initialized as a basis for testing functionality
	protected static String[][] allDealersInventory = {{"Transit", "Mazda", "RX8", "25"},
													{"Transit", "Mazda", "Miata", "10"},
													{"Union", "Honda", "Accord", "17"},
													{"Union", "Honda", "Civic", "12"}};
	
	// Very basic 2D array initialized as a basis for testing functionality
	protected static String[][] componentPartData =   {{"Number of Cylinders", "4", "Honda", "Civic", "800", "true"},
													{"Number of Cylinders", "6", "Honda", "Accord", "1000", "true"},
													{"Number of Cylinders", "6", "Ford", "Mustang", "1500", "true"},
													{"Number of Cylinders", "8", "Ford", "Mustang", "2000", "true"},
													{"Transmission", "Manual", "Honda", "Accord", "1800", "true"}};

	/* Main method */
	public static void main(String[] args) {
		
	////////////////////////	BUILDER PATTERN		/////////////////////////////
		
		/////////////////////////////////////////////////////////////////////////
		// Demonstrates the CustomCarOrderBuilder (a concrete builder class) that	/
		// determines which dealership has the user-specified make/manufacturer /
		// in its inventory (selected through a GUI).							/	
		/////////////////////////////////////////////////////////////////////////
		new OrderFrame();
		
		/////////////////////////////////////////////////////////////////////////
		// Demonstrates the HondaSportsCarOrderBuilder (a concrete builder class) 	/
		// that	displays the preset values in order to build a Honda Sports CarOrder	/
		/////////////////////////////////////////////////////////////////////////
		CarOrderDirector carOrderDirector = new CarOrderDirector();
		CarOrderBuilder hondaSportsCarBuilder = new HondaSportsCarOrderBuilder();
		carOrderDirector.makeCar(hondaSportsCarBuilder);
		CarOrder sportsCar = hondaSportsCarBuilder.GetCar();
		System.out.println(sportsCar);
		
	////////////////////////////////////////////////////////////////////////////
		
	} /* End of main(String[] args) */
} /* End of Main class */