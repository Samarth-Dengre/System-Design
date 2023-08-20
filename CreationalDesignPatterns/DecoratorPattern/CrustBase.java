package CreationalDesignPatterns.DecoratorPattern;

public class CrustBase implements Pizza{
    CrustBase(Pizza p){}
    @Override
    public int getCost() {
        return 20;
    }
}
