package main.java.builder;

import main.java.builder.Car.CarBuilder;

public class Car 
{
	public final String make; 			// Required
	public final String model; 			// Required
	public final String dealership;		// Required
	public final String color; 			// Required
	public final String vehicleType;	// Required
	public final int numCylinders;		// Required
	public final String cabMaterial;	// Required
	public final String transmission;	// Required
	public final double tireSize;		// Required
	public Boolean spoilerUpgrade;		// Optional
	public Boolean mufflerUpgrade;		// Optional
	public Boolean bodyKitUpgrade;		// Optional
	public Boolean engineUpgrade;		// Optional
    
    ///////////////////////		CONSTRUCTOR		/////////////////////////
    public Car(CarBuilder builder) {
    	this.make = builder.make;
    	this.model = builder.model;
    	this.dealership = builder.dealership;
    	this.color = builder.color;
    	this.vehicleType = builder.vehicleType;
    	this.numCylinders = builder.numCylinders;
    	this.cabMaterial = builder.cabMaterial;
    	this.transmission = builder.transmission;
    	this.tireSize = builder.tireSize;
    	this.spoilerUpgrade = builder.spoilerUpgrade;
    	this.mufflerUpgrade = builder.mufflerUpgrade;
    	this.bodyKitUpgrade = builder.bodyKitUpgrade;
    	this.engineUpgrade = builder.engineUpgrade;
    }
    
    ///////////////////////		GET METHODS		/////////////////////////
    public String getMake() {
    	return make;
    }
    public String getModel() {
    	return model;
    }
    public String getDealership() {
    	return dealership;
    }
    public String getColor() {
    	return color;
    }
    public String getVehicleType() {
    	return vehicleType;
    }
    public int getNumCylinders() {
    	return numCylinders;
    }
    public String getCabMaterial() {
    	return cabMaterial;
    }
    public String getTransmission() {
    	return transmission;
    }
    public double getTireSize() {
    	return tireSize;
    }
    public Boolean getSpoilerUpgrade() {
    	return spoilerUpgrade;
    }
    public Boolean getMufflerUpgrade() {
    	return mufflerUpgrade;
    }
    public Boolean getBodyKitUpgrade() {
    	return bodyKitUpgrade;
    }
    public Boolean getEngineUpgrade() {
    	return engineUpgrade;
    }
    
    ///////////////////	RETURNS DETAILS OF  OBJECT	/////////////////////
    @Override
    public String toString() {
    	return "Car details: "+this.make+" "+this.model+" | Color: "+this.color+" | Classification: "+
    			this.vehicleType+" | Engine: "+this.numCylinders+" | Transmission: "+this.transmission+
    			" | Interior: "+this.cabMaterial+" | Tire size: "+this.tireSize+" | Spoiler upgrade: "+
    			this.spoilerUpgrade+" | Muffler upgrade: "+this.mufflerUpgrade+" | Body kit upgrade: "+
    			this.bodyKitUpgrade+" | Engine upgrade: "+this.engineUpgrade;
    }
    
	////////////////////////	BUILDER CLASS	/////////////////////////
    public static class CarBuilder 
    {
        private final String make; 			// Required
        private final String model; 		// Required
        private final String dealership;	// Required
        private final String color; 		// Required
        private final String vehicleType;	// Required
        private final int numCylinders;		// Required
        private final String cabMaterial;	// Required
        private final String transmission;	// Required
        private final double tireSize;		// Required
        private Boolean spoilerUpgrade;		// Optional
        private Boolean mufflerUpgrade;		// Optional
        private Boolean bodyKitUpgrade;		// Optional
        private Boolean engineUpgrade;		// Optional
        
        ////////////////////	REQUIRED ATTRIBUTES		////////////////////
        public CarBuilder(String make, String model, String dealership, 
        		String color, String vehicleType, int numCylinders, 
        		String cabMaterial, String transmission, double tireSize) 
        {
        	this.make = make;
        	this.model = model;
        	this.dealership = dealership;
        	this.color = color;
        	this.vehicleType = vehicleType;
        	this.numCylinders = numCylinders;
        	this.cabMaterial = cabMaterial;
        	this.transmission = transmission;
        	this.tireSize = tireSize;
        }
        
        ////////////////////	OPTIONAL ATTRIBUTES		////////////////////
        public CarBuilder spoilerUpgrade(Boolean spoilerUpgrade) {
        	this.spoilerUpgrade = spoilerUpgrade;
        	return this;
        }
        public CarBuilder mufflerUpgrade(Boolean mufflerUpgrade) {
        	this.mufflerUpgrade = mufflerUpgrade;
        	return this;
        }
        public CarBuilder bodyKitUpgrade(Boolean bodyKitUpgrade) {
        	this.bodyKitUpgrade = bodyKitUpgrade;
        	return this;
        }
        public CarBuilder engineUpgrade(Boolean engineUpgrade) {
        	this.engineUpgrade = engineUpgrade;
        	return this;
        }
       
        /////////////	RETURNS FULLY CONSTRUCTED OBJECT	///////////////
        public Car build() {
        	Car car = new Car(this);
        	validateCarObject(car);
        	return car;
        }
       
        /////////////	VALIDATES FULLY CONSTRUCTED OBJECT	///////////////
        private void validateCarObject(Car car) {
        	// Validate selected attributes of the car
        }
    }
}
