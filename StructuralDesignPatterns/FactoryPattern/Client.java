package StructuralDesignPatterns.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        BikeFactory bf = new BikeFactory();
        Bike b1 = bf.getInstance("Platina");
        Bike b2 = bf.getInstance("Splender");
        b1.startVehicle();
        b2.startVehicle();
    }
}
