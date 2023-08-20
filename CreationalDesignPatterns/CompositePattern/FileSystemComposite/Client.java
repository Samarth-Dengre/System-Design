package CreationalDesignPatterns.CompositePattern.FileSystemComposite;

public class Client {
    public static void main(String[] args) {
        Directory mainDirectory = new Directory("Main");
        Directory child1 = new Directory("Child1");
        Directory child2 = new Directory("Child2");

        FileSystem f1 = new File("File1");
        FileSystem f2 = new File("File2");
        FileSystem f3 = new File("File3");
        FileSystem f4 = new File("File4");

        child2.add(f3);
        child2.add(f4);
        child1.add(f2);
        child1.add(child2);
        mainDirectory.add(child1);
        mainDirectory.add(f1);;

        mainDirectory.ls();
    }
}
