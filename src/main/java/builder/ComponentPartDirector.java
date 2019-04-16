package main.java.builder;

public class ComponentPartDirector {
    public void makeComponentPart(ComponentPartBuilder componentPartBuilder) {
        componentPartBuilder.addPartType();
        componentPartBuilder.addId();
        componentPartBuilder.addManufacturer();
        componentPartBuilder.addCompatibility();
        componentPartBuilder.addCost();
        componentPartBuilder.addIsRequired();
    }
}
