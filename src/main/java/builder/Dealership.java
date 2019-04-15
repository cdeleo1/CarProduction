package main.java.builder;

public class Dealership 
{
	public final String name; 			// Required
	public final String manufacturer;	// Required
	public final int numEmployees;		// Required
	public final String[][] inventory;	// Required
	
    ///////////////////////		CONSTRUCTOR		/////////////////////////
    public Dealership(DealershipBuilder builder) {
    	this.name = builder.name;
    	this.manufacturer = builder.manufacturer;
    	this.numEmployees = builder.numEmployees;
    	this.inventory = builder.inventory;
    }
    
    ///////////////////////		GET METHODS		/////////////////////////
    public String getName() {
    	return name;
    }
    public String getManufacturer() {
    	return manufacturer;
    }
    public int getNumEmployees() {
    	return numEmployees;
    }
    public String[][] getInventory() {
    	return inventory;
    }
    
    ///////////////////	RETURNS DETAILS OF  OBJECT	/////////////////////
    @Override
    public String toString() {
    	return "Dealership: "+this.name+" | Manufacturer: "+this.manufacturer+
    			" | Number of Employees: "+this.numEmployees+" | Inventory: "+this.inventory;
    }
    
	////////////////////////	BUILDER CLASS	/////////////////////////
    public static class DealershipBuilder 
    {
    	public final String name; 			// Required
    	public final String manufacturer;	// Required
    	public final int numEmployees;		// Required
    	public final String[][] inventory;	// Required
        
        ////////////////////	REQUIRED ATTRIBUTES		////////////////////
        public DealershipBuilder(String name, String manufacturer, int numEmployees, 
        		String[][] inventory) 
        {
        	this.name = name;
        	this.manufacturer = manufacturer;
        	this.numEmployees = numEmployees;
        	this.inventory = inventory;
        }
        
        ////////////////////	OPTIONAL ATTRIBUTES		////////////////////
        /*public DealershipBuilder optionalAttr1(Boolean optionalAttr1) {
        	this.optionalAttr1 = optionalAttr1;
        	return this;
        }*/
       
        /////////////	RETURNS FULLY CONSTRUCTED OBJECT	///////////////
        public Dealership build() {
        	Dealership dealership = new Dealership(this);
        	validateDealershipObject(dealership);
        	return dealership;
        }
       
        /////////////	VALIDATES FULLY CONSTRUCTED OBJECT	///////////////
        private void validateDealershipObject(Dealership dealership) {
        	// Validate selected attributes of the dealership
        }
    }

}
    
