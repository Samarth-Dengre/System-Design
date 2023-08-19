package StructuralDesignPatterns.PrototypePattern;

public class Circle extends Shape {
    private int radius;
    Circle(int x, int y, String color, int radius){
        super(x, y, color);
        this.radius = radius;
    }

    Circle(Circle c){
        super(c);
        this.radius = c.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean checkEqual(Object obj) {
        Circle c = (Circle) obj;
        return (this.radius == c.radius && super.checkEqual(obj));
    }
}
