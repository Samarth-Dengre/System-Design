package CreationalDesignPatterns.CompositePattern.InfixCalculator;

public class Client {
    public static void main(String[] args) {
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression exp1 = new Expression(one, seven, Operator.ADD);
        ArithmeticExpression exp2 = new Expression(two, exp1, Operator.MULTIPLY);

        System.out.println(exp2.evaluate());
    }
}
