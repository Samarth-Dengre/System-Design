package CreationalDesignPatterns.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Pizza p1 = new CheeseToppings(new MushroomToppings(new CrustBase(null)));
        Pizza p2 = new OliveToppings(new MushroomToppings(new CrustBase(null)));

        System.out.println(p1.getCost());
        System.out.println(p2.getCost());
    }
}
