package StructuralDesignPatterns.AbstractFactory;

public class AbstractFactory {
    public Factory getFactoryInstance(String type){
        if(type.equalsIgnoreCase("WINDOWS"))    return new WindowsFactory();
        else if(type.equalsIgnoreCase("MAC"))   return new MacFactory();
        return null;
    }
}
