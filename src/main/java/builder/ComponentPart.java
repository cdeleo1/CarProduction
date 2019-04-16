package main.java.builder;

public class ComponentPart {
    public String partType; // Required
    public String id; // Required
    public String manufacturer; // Required
    public String[] compatibility; // Required
    public String cost; // Required
    public String isRequired; // Required

    public String getPartType() {
        return this.partType;
    }

    public String getId() {
        return this.id;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String[] getCompatibility() {
        return this.compatibility;
    }

    public String getCost() {
        return this.cost;
    }

    public String getIsRequired() {
        return this.isRequired;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCompatibility(String[] compatibility) {
        this.compatibility = compatibility;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    @Override
    public String toString() {
        return "manufacturer: " + this.manufacturer 
                + " | Car Order details: " + this.partType + " " 
                + this.id + " | compatibility: " + this.compatibility 
                + " | Classification: " + this.cost + " | Engine: "
                + this.isRequired;
    }
}
