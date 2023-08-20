package CreationalDesignPatterns.DecoratorPattern;

public class OliveToppings implements Pizza {
    Pizza pizza;
    OliveToppings(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 12;
    }
}
