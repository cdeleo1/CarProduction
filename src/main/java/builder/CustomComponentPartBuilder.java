package main.java.builder;

import main.java.Main;

public class CustomComponentPartBuilder extends ComponentPartBuilder {
    private ComponentPart customComponentPart = new ComponentPart();
    public String[][] componentPartData = Main.getComponentPartData();

    @Override
    public void AddPartType() {
        customComponentPart.partType = componentPartData[0][0];
    }

    @Override
    public void AddID() {
        customComponentPart.id = componentPartData[0][1];
        ;
    }

    @Override
    public void AddManufacturer() {
        customComponentPart.manufacturer = componentPartData[0][2];
    }

    @Override
    public void AddCompatibility() {
        customComponentPart.compatibility[0] = componentPartData[0][3];
    }

    @Override
    public void AddCost() {
        customComponentPart.cost = componentPartData[0][4];
    }

    @Override
    public void AddIsRequired() {
        customComponentPart.isRequired = componentPartData[0][5];
    }

    @Override
    public ComponentPart GetComponentPart() {
        return customComponentPart;
    }
}