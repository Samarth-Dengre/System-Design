package CreationalDesignPatterns.CompositePattern.InfixCalculator;

public class Number implements ArithmeticExpression{
    double value;
    Number(double value){
        this.value = value;
    }
    @Override
    public double evaluate() {
        return value;
    }
}
