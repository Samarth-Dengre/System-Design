package CreationalDesignPatterns.DecoratorPattern;

public class CheeseToppings implements Pizza {
    Pizza pizza;
    CheeseToppings(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 10;
    }
}
