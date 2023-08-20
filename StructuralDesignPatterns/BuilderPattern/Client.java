package StructuralDesignPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Director d = new Director(new EngineerBuilder());
        Student engineer = d.createEngineeringStudent();
        System.out.println(engineer.toString());

        d = new Director(new MBABuilder());
        Student mba = d.createStudent();
        System.out.println(mba.toString());
    }
}
