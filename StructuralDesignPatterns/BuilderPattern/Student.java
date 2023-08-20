package StructuralDesignPatterns.BuilderPattern;

import java.util.ArrayList;

public class Student {
    String name;
    String fathersName;
    String mothersName;
    int age;
    ArrayList<String> subjects;

    Student(StudentBuilder builder){
        this.age = builder.age;
        this.fathersName = builder.fathersName;
        this.mothersName = builder.mothersName;
        this.name = builder.name;
        this.subjects = builder.subjects;
    }

    public String toString(){
        return  " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fathersName +
                " mother name: " + this.mothersName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }

}
