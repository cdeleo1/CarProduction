package main.java.builder;

public abstract class ComponentPartBuilder {
    public abstract void addPartType();

    public abstract void addID();

    public abstract void addManufacturer();

    public abstract void addCompatibility();

    public abstract void addCost();

    public abstract void addIsRequired();

    public abstract ComponentPart getComponentPart();
}
