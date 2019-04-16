package main.java.builder;

public class ComponentPart {
	public String PartType; // Required
	public String ID; // Required
	public String Manufacturer; // Required
	public String Compatibility[]; // Required
	public String Cost; // Required
	public String IsRequired; // Required

	public String getPartType() {
		return this.PartType;
	}

	public String getID() {
		return this.ID;
	}

	public String getManufacturer() {
		return this.Manufacturer;
	}

	public String[] getCompatibility() {
		return this.Compatibility;
	}

	public String getCost() {
		return this.Cost;
	}

	public String getIsRequired() {
		return this.IsRequired;
	}

	public void setPartType(String PartType) {
		this.PartType = PartType;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public void setManufacturer(String Manufacturer) {
		this.Manufacturer = Manufacturer;
	}

	public void setCompatibility(String[] Compatibility) {
		this.Compatibility = Compatibility;
	}

	public void setCost(String Cost) {
		this.Cost = Cost;
	}

	public void setIsRequired(String IsRequired) {
		this.IsRequired = IsRequired;
	}

	@Override
	public String toString() {
		return "Manufacturer: " + this.Manufacturer + " | Car Order details: " + this.PartType + " " + this.ID
				+ " | Compatibility: " + this.Compatibility + " | Classification: " + this.Cost + " | Engine: "
				+ this.IsRequired;
	}
}
