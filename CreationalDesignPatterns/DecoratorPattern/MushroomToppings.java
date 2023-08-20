package CreationalDesignPatterns.DecoratorPattern;

public class MushroomToppings implements Pizza {
    Pizza pizza;
    MushroomToppings(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 5;
    }
}
