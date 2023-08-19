package StructuralDesignPatterns.PrototypePattern;

public abstract class Shape {
    private String color;
    private int x, y;
    Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    Shape(Shape s){
        this.x = s.x;
        this.y = s.y;
        this.color = s.color;
    }
    public abstract Shape clone();
    public boolean checkEqual(Object obj){
        Shape s = (Shape) obj;
        return (this.x == s.x && this.y == s.y && this.color.equals(s.color));
    }
}
