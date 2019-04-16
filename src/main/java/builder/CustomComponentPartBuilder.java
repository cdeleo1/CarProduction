package main.java.builder;

import main.java.Main;

public class CustomComponentPartBuilder extends ComponentPartBuilder {
    private ComponentPart customComponentPart = new ComponentPart();
    public String[][] componentPartData = Main.getComponentPartData();

    @Override
    public void addPartType() {
        customComponentPart.partType = componentPartData[0][0];
    }

    @Override
    public void addId() {
        customComponentPart.id = componentPartData[0][1];
        ;
    }

    @Override
    public void addManufacturer() {
        customComponentPart.manufacturer = componentPartData[0][2];
    }

    @Override
    public void addCompatibility() {
        customComponentPart.compatibility[0] = componentPartData[0][3];
    }

    @Override
    public void addCost() {
        customComponentPart.cost = componentPartData[0][4];
    }

    @Override
    public void addIsRequired() {
        customComponentPart.isRequired = componentPartData[0][5];
    }

    @Override
    public ComponentPart getComponentPart() {
        return customComponentPart;
    }
}