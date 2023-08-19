package StructuralDesignPatterns.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory a = new AbstractFactory();
        Factory f1 = a.getFactoryInstance("WINDOWS");
        Factory f2 = a.getFactoryInstance("MAC");

        f1.createButton().paint();
        f1.createCheckBox().paint();
        f2.createButton().paint();
        f2.createCheckBox().paint();
    }
}
