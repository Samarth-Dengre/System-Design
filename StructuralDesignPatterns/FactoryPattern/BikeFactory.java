package StructuralDesignPatterns.FactoryPattern;

public class BikeFactory {
    public Bike getInstance(String type){
        if(type.equalsIgnoreCase("Platina"))    return new Platina();
        else if(type.equalsIgnoreCase("Splender"))  return new Splender();
        else return null;
    }
}
