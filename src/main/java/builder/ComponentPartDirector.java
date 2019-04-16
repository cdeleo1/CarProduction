package main.java.builder;

public class ComponentPartDirector {
    public void makeComponentPart(ComponentPartBuilder componentPartBuilder) {
        componentPartBuilder.addPartType();
        componentPartBuilder.addID();
        componentPartBuilder.addManufacturer();
        componentPartBuilder.addCompatibility();
        componentPartBuilder.addCost();
        componentPartBuilder.addIsRequired();
    }
}
