package StructuralDesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentBuilder {
    String name;
    String fathersName;
    String mothersName;
    int age;
    ArrayList<String> subjects;
    StudentBuilder setName(String name){
        this.name = name;
        return  this;
    }
    StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }
    StudentBuilder setMothersName(String name){
        this.mothersName = name;
        return this;
    }
    StudentBuilder setFathersName(String name){
        this.fathersName = name;
        return this;
    }
    abstract StudentBuilder setSubjects();

    abstract Student build();
}
