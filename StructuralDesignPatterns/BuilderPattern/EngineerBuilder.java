package StructuralDesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerBuilder extends StudentBuilder{
    @Override
    StudentBuilder setSubjects() {
        super.subjects = new ArrayList<>();
        super.subjects.add("M1");
        super.subjects.add("M2");
        super.subjects.add("M3");
        return this;
    }
    @Override
    Student build() {
        return new Student(this);
    }
}
