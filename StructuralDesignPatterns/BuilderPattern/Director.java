package StructuralDesignPatterns.BuilderPattern;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    Student createStudent(){
        if(studentBuilder instanceof EngineerBuilder)   return createEngineeringStudent();
        else if(studentBuilder instanceof MBABuilder)   return createMBAStudent();
        return null;
    }

    Student createEngineeringStudent(){
        return studentBuilder.setAge(20).setName("Ram").setFathersName("Dashrath").setSubjects().build();
    }

    Student createMBAStudent(){
        return studentBuilder.setAge(24).setName("Anuroop").setFathersName("MR. XYZ").setMothersName("MRS. PQR").setSubjects().build();
    }
}
