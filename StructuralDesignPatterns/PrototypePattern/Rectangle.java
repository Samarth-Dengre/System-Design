package StructuralDesignPatterns.PrototypePattern;

public class Rectangle extends Shape {
    private int height, width;
    Rectangle(int height, int width, int x, int y, String color){
        super(x, y, color);
        this.height = height;
        this.width = width;
    }

    Rectangle(Rectangle r){
        super(r);
        this.height = r.height;
        this.width = r.width;
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean checkEqual(Object obj) {
        Rectangle r = (Rectangle) obj;
        return (this.height == r.height && this.width == r.width && super.checkEqual(obj));
    }
}
