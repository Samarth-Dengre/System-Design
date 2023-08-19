package StructuralDesignPatterns.AbstractFactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painted Mac Button");
    }
}
