package CreationalDesignPatterns.CompositePattern.InfixCalculator;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression left;
    ArithmeticExpression right;
    Operator operator;

    Expression(ArithmeticExpression left, ArithmeticExpression right, Operator operator){
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
    @Override
    public double evaluate() {
        double value = 0;
        switch (operator){
            case ADD :
                value = left.evaluate() + right.evaluate();
                break;
            case SUBTRACT :
                value = left.evaluate() - right.evaluate();
                break;
            case DIVIDE:
                value = left.evaluate() / right.evaluate();
                break;
            case MULTIPLY:
                value = left.evaluate() * right.evaluate();
                break;
            case MOD:
                value = left.evaluate() % right.evaluate();
                break;
            default:
                value = 0;
        }
        return value;
    }
}
