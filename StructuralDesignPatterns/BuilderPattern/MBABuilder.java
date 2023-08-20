package StructuralDesignPatterns.BuilderPattern;

import java.util.ArrayList;

public class MBABuilder extends StudentBuilder{
    @Override
    StudentBuilder setSubjects() {
        subjects = new ArrayList<>();
        subjects.add("B1");
        subjects.add("B2");
        subjects.add("B3");
        return this;
    }
    @Override
    Student build() {
        return new Student(this);
    }
}
