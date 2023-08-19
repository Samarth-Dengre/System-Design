package StructuralDesignPatterns.PrototypePattern;

import StructuralDesignPatterns.PrototypePattern.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10 ,20, "Red", 5);
        Circle c2 = (Circle) c1.clone();

        Rectangle r1 = new Rectangle(5, 7, 1, 2, "Blue");
        Rectangle r2 = (Rectangle) r1.clone();

        Circle c3 = new Circle(1, 3, "Red", 9);

        System.out.println(r1.checkEqual(r2));
        System.out.println(c1.checkEqual(c2));
        System.out.println(c1.checkEqual(c3));
    }
}
