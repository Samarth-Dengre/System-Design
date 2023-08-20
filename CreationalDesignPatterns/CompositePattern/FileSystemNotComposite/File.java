package CreationalDesignPatterns.CompositePattern.FileSystemNotComposite;

public class File {
    String name;
    File(String name){
        this.name = name;
    }

    void ls(){
        System.out.println("File Name: " + name);
    }
}
