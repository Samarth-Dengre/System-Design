package StructuralDesignPatterns.AbstractFactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Painted Mac Checkbox");
    }
}
